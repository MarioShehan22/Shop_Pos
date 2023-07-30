package com.shehan.pos.dao;

import com.shehan.pos.dto.CustomerDto;
import com.shehan.pos.dto.UserDto;
import com.shehan.pos.util.PasswordManager;

import java.sql.*;
import java.util.List;

public class DatabaseAccessCode {
    //User management
    public static boolean createUser(String email,String password) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","As@2230342#");
        String sql = "INSERT INTO user VALUES(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,email);
        preparedStatement.setString(2, PasswordManager.encrypetPassword(password));

        return preparedStatement.executeUpdate()>0;
    }

    public static UserDto findUser(String email) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","As@2230342#");
        String sql = "SELECT * FROM user & WHERE email=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,email);

        ResultSet set = preparedStatement.executeQuery();

        if (set.next()){
            return new UserDto(
                    set.getString(1),
                    set.getString(2)
            );
        }
        return null;
    }
    //User management

    //Customer management
    public static boolean createCustomer(String email,String name,String contact,double salary){
        return false;
    }
    public static boolean UpdateCustomer(String email,String name,String contact,double salary){
        return false;
    }
    public static boolean findCustomer(String email){
        return false;
    }
    public static boolean deleteCustomer(String email){
        return false;
    }
    public static List<CustomerDto> findAllCustomer(String email){
        return null;
    }
    public static List<CustomerDto> searchAllCustomer(String searchText){
        return null;
    }

    //Customer management
}
