/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runAnotherJava;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author arifika.aop06542
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        stuff();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
    public void stuff(){// run for java -jar program
        try {
            String command = "C:\\Users\\arifika.aop06542\\Downloads\\TriedNueTransfer\\dist\\TriedNueTransfer.jar"; 
  
            // Running the above command 
            Runtime run  = Runtime.getRuntime(); 
            Process proc = run.exec(" java -jar "+command); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }

     public void stuff2(){// run for java -jar program
        try {
            String command = "C:"; 
  
            // Running the above command 
            Runtime run  = Runtime.getRuntime(); 
            Process proc = run.exec(command); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
    
}
