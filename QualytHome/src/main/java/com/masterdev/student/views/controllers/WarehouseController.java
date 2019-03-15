package com.masterdev.student.views.controllers;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.net.URL;

import java.util.ResourceBundle;

import com.masterdev.student.middle.TextFieldMethods;
import com.masterdev.student.middle.ComboBoxMethods;
import com.masterdev.student.middle.DashboardButtonAnimations;
import com.masterdev.student.middle.ImageViewMethods;
import com.masterdev.student.views.Home;
import com.masterdev.student.views.Personal;
import com.masterdev.student.views.Warehouse;
import com.masterdev.student.views.WarehouseForm;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;

public class WarehouseController {
	@FXML Button btnAddWarehouse;
	@FXML Button btnAddAsset;
	
	@FXML 
	protected void openWarehouseForm() {
		WarehouseForm wf = new WarehouseForm();
		wf.launchWarehouseForm();
	}
	
	@FXML
	protected void openAssetForm() {
		
	}
}
