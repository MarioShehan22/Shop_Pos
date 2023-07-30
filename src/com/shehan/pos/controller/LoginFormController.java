package com.shehan.pos.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.shehan.pos.dao.DatabaseAccessCode;
import com.shehan.pos.dto.UserDto;
import com.shehan.pos.util.PasswordManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class LoginFormController {

    public JFXTextField txtemail;
    public JFXPasswordField txtpassword;
    public AnchorPane context;


    public void btnSignInOnAction(ActionEvent actionEvent) throws IOException {
        try {
            UserDto ud = DatabaseAccessCode.findUser(txtemail.getText());
            if (ud!=null){
                if (PasswordManager.checkPassword(txtpassword.getText(),ud.getPassword())){
                    System.out.println("Completed");
                }else {
                    new Alert(Alert.AlertType.WARNING,"check you password try again!").show();
                }
                clearFields();
            }else {
                new Alert(Alert.AlertType.WARNING,"user email not found!");
            }


        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }

    }

    private void clearFields() {
        txtemail.clear();
        txtpassword.clear();
    }

    public void btnCreateAnAccountOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SignUpForm");
    }
    private void setUi(String url) throws IOException {
        Stage stage = (Stage)context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+url+".fxml"))));
        stage.centerOnScreen();
    }
}
