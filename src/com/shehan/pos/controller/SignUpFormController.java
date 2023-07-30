package com.shehan.pos.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.shehan.pos.dao.DatabaseAccessCode;
import com.shehan.pos.util.PasswordManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class SignUpFormController {

    public AnchorPane context;
    public JFXTextField txtemail;
    public JFXPasswordField txtpassword;


    public void btnRegisterNowOnAction(ActionEvent actionEvent){
        try {
            if (DatabaseAccessCode.createUser(txtemail.getText(),txtpassword.getText())){
                new Alert(Alert.AlertType.CONFIRMATION,"User Saved!");
                clearFields();
            }else{
                new Alert(Alert.AlertType.WARNING,"Try Again!");
            }

        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    public void btnAlRedyhaveAnAccountOnAction(ActionEvent actionEvent) throws IOException {
        setUi("LoginForm.fxml");
    }

    private void clearFields() {
        txtemail.clear();
        txtpassword.clear();
    }

    private void setUi(String url) throws IOException {
        Stage stage = (Stage)context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+url+".fxml"))));
        stage.centerOnScreen();
    }
}
