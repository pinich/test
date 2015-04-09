/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author pini
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private WebView webweb;
    @FXML
    private Slider sld1;
    @FXML
    private ProgressIndicator prgi;
     

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @FXML
    private void cClick(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        WebEngine webeng = webweb.getEngine();
        webeng.load("http://pinich.ddns.net/pics/");
        //webeng.load("http://5.29.117.8/pics/");
        //webeng.load("https://www.whatismybrowser.com/");
        // Listen for Slider value changes
        sld1.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable,
                    Number oldValue, Number newValue) {
                prgi.setProgress(newValue.doubleValue()/100);
            }
        });

    }

}
