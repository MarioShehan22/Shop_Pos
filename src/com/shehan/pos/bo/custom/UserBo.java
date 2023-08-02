package com.shehan.pos.bo.custom;

import com.shehan.pos.bo.SuperBo;
import com.shehan.pos.dto.UserDto;

import java.sql.SQLException;
import java.util.List;

public interface UserBo extends SuperBo {
    public boolean saveUser(UserDto dto) throws SQLException, ClassNotFoundException;
    public boolean updateUser(UserDto dto);
    public boolean deleteUser(String email);
    public UserDto findUser(String email) throws SQLException, ClassNotFoundException;
    public List<UserDto> findAllUsers();
}
