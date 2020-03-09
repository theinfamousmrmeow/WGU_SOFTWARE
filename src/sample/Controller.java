package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {

    @FXML
    private Button btnExit;

    @FXML
    public void blowUp (){
        btnExit.setVisible(false);
    }


}
