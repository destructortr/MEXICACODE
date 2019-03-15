package com.masterdev.student.views.controllers;

import javafx.application.Platform;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import java.io.IOException;

import com.masterdev.student.middle.MiddleDemo;
import com.masterdev.student.middle.Authentication;
import com.masterdev.student.middle.Languages;
import com.masterdev.student.views.Dashboard;
import com.masterdev.student.views.Login;

public class LoginController {
	
	@FXML
	protected void toEnglish(ActionEvent event) {
		Languages lan = new Languages();
		lan.setEnglish();
	}
	
	@FXML
	protected void toSpanish(ActionEvent event) {
		Languages lan = new Languages();
		lan.setSpanish();
	}
	
	@FXML TextField txtUsername;
	@FXML TextField txtPassword;
	
	@FXML
	protected void login(ActionEvent event) {
		System.out.println(txtUsername.getText());
		System.out.println(txtPassword.getText());
		System.out.println(Languages.getLanguage());
		Authentication a = new Authentication();
		if(a.isValidUser())
		{
			Login.getStage().close();
			new Dashboard().launchDashboard();
		}
	}
	
	//Just an example of a JavaFX controller
	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
        MiddleDemo md = new MiddleDemo(23);
        System.out.println(md.getDemo());
    }
}
