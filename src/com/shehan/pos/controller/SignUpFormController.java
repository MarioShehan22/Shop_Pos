package com.shehan.pos.controller;

import com.shehan.pos.bo.BoFactory;
import com.shehan.pos.bo.custom.UserBo;
import com.shehan.pos.bo.custom.impl.UserBoImpl;
import com.shehan.pos.dto.UserDto;
import com.shehan.pos.enums.BoType;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

class SignupFormController {
    public AnchorPane context;
    public JFXTextField txtEmail;
    public JFXPasswordField textPassword;

    UserBo bo= BoFactory.getInstance().getBo(BoType.USER);

    public void btnAlreadyHaveAnAccountOnAction(ActionEvent actionEvent) throws IOException {
        setUi("LoginForm");
    }

    public void btnRegisterNowOnAction(ActionEvent actionEvent) {
        try {
            if (bo.saveUser(new UserDto(txtEmail.getText(), textPassword.getText()))) {
                new Alert(Alert.AlertType.CONFIRMATION, "User Saved!").show();
                clearFields();
            } else {
                new Alert(Alert.AlertType.WARNING, "Try Again!").show();
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }

    }

    private void clearFields() {
        txtEmail.clear();
        textPassword.clear();
    }

    private void setUi(String url) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(
                new Scene(FXMLLoader.load(getClass().getResource("../view/" + url + ".fxml")))
        );
        stage.centerOnScreen();
    }
}
