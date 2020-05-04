package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class ControllerAddProduct {


    //addPart Form
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnSave;


    @FXML
    public void blowUp (){
        Platform.exit();
        System.exit(0);
        //btnExit.setVisible(false);
    }

    public void hide(){
        btnSave.getScene().getWindow().hide();
    }

    public void returnToMain(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        try {
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("ABC");
            stage.setScene(new Scene(root1));
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        hide();
    }
}
