package com.masterdev.student.middle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import java.io.IOException;

import org.controlsfx.control.textfield.TextFields;

import com.masterdev.student.middle.MiddleDemo;
import com.masterdev.student.middle.Authentication;
import com.masterdev.student.middle.Languages;
import com.masterdev.student.middle.DashboardButtonAnimations;
import com.masterdev.student.views.Dashboard;
import com.masterdev.student.views.Login;

public class TextFieldMethods {

	public void addTextFieldFocusListener(final TextField textField, final String defaultText) {
		textField.focusedProperty().addListener(new ChangeListener<Boolean>()
		{
		    public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
		    {
		        if (newPropertyValue)
		        {
		        	if(textField.getText().equals(defaultText))
		        		textField.setText("");
		        }
		        else
		        {
		        	if(textField.getText().equals(""))
		        		textField.setText(defaultText);
		        }
		    }
		});
	}
	
	public void addWordSuggestions(TextField textField, String[] wordSuggestions) {
		TextFields.bindAutoCompletion(textField, wordSuggestions);
	}
}
