package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class ControllerAddPart {


    //Constructor;
    public ControllerAddPart(){
    }


    //addPart Form
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnSave;
    @FXML
    private Label lblCompanyNameOrMachineID;
    @FXML
    private RadioButton rbInHouse;
    @FXML
    private RadioButton rbOutsourced;
    @FXML
    private TextField tfID;
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfInventory;
    @FXML
    private TextField tfPriceCost;
    @FXML
    private TextField tfMax;
    @FXML
    private TextField tfMin;
    @FXML
    private TextField tfCompanyNameOrMachineID;




    @FXML
    public void initialize(){

        tfID.setDisable(true);
    }

    @FXML
    public void blowUp (){
        Platform.exit();
        System.exit(0);
        //btnExit.setVisible(false);
    }


    public void hide(){
        btnSave.getScene().getWindow().hide();
    }

    public void deselectAllRadioButton(){
        rbInHouse.setSelected(false);
        rbOutsourced.setSelected(false);
    }

    public void handleInhouse(){
        deselectAllRadioButton();
        rbInHouse.setSelected(true);
        updateBottomLabel();
    }

    public void handleOutsourced(){
        deselectAllRadioButton();
        rbOutsourced.setSelected(true);
        updateBottomLabel();
    }

    public void updateBottomLabel(){
        if (rbOutsourced.isSelected()){lblCompanyNameOrMachineID.setText("Company Name");}
        else {
            lblCompanyNameOrMachineID.setText("Machine ID");
        }
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
