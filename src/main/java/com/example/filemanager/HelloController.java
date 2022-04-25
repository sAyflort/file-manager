package com.example.filemanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;

import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class HelloController{
    @FXML
    private VBox authGUI;
    @FXML
    private VBox fmGUI;
    @FXML
    private TextField loginField;
    @FXML
    private PasswordField passField;

    public Stage regStage;
    private RegAppController regAppController;

    public void auth(ActionEvent actionEvent) {
        authGUI.setVisible(false);
        authGUI.setManaged(false);
        fmGUI.setVisible(true);
        fmGUI.setManaged(true);
    }

    public void reg(ActionEvent actionEvent) throws Exception {

    }

}