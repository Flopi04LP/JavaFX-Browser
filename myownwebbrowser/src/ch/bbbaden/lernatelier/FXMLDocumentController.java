/*
 --------------------------------------------
 Datei:			myownbrowser
 Datum:			18.01.2021
 Ersteller:		Florian Buechi
 Version:		1.0
 Änderungen:		
 					
 Beschreibung:
 Dieses Java Programm ist ein Browser.

 */
package ch.bbbaden.lernatelier;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

/**
 *
 * @author flori
 */
public class FXMLDocumentController implements Initializable {

  
    
    private Label label;
    @FXML
    private WebView myWebView;
    @FXML
    private Button button1;
    @FXML
    private Button leftarrowbutton;
    @FXML
    private AnchorPane window;
    @FXML
    private Button rightarrowbutton;
    @FXML
    private TextField textbar;
    @FXML
    private Button searchbutton;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        WebEngine engine = myWebView.getEngine();
        engine.load("https://www.startpage.com");
        engine = myWebView.getEngine();
        
        textbar.setText(engine.getLocation());
    }
    

    @FXML
    private void btnclick(ActionEvent event) {
        WebEngine engine = myWebView.getEngine();
        engine.reload();
    }

    @FXML
    private void goBack(ActionEvent event) {
        WebEngine engine = myWebView.getEngine();
        WebEngine webEngine = myWebView.getEngine();
        
        WebHistory history = webEngine.getHistory();
        history.go(-1);

    }

    @FXML
    private void goforward(ActionEvent event) {
        WebEngine engine = myWebView.getEngine();
        WebEngine webEngine = myWebView.getEngine();
        
        WebHistory history = webEngine.getHistory();
        history.go(1);
    }

   

    @FXML
    private void textsearch(ActionEvent event) {
        WebEngine engine = myWebView.getEngine();
        engine.load(textbar.getText());
        
    }

  
   
    
}
