package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.rmi.server.ExportException;


public class ControllerMain {


    ////Main Form
    @FXML
    private Button btnExit;
    @FXML
    private Button btnAddPart;
    @FXML
    private Button btnModifyPart;
    @FXML
    private Button btnDeletePart;
    @FXML
    private Button btnAddProduct;
    @FXML
    private Button btnModifyProduct;
    @FXML
    private Button btnDeleteProduct;

    //addPart Form
    @FXML
    private Button btnAddPartCancel;
    @FXML
    private Button btnAddPartSave;


    enum ScreenStates {
        Modify,
        Add,
        Delete
    }

    @FXML
    public void blowUp (){
        Platform.exit();
        System.exit(0);
        //btnExit.setVisible(false);
    }

    @FXML
    public void showAddPartScreen(){
        this.showSubSceneCommon("addPart.fxml", ScreenStates.Add);
    }

    @FXML
    public void showModifyPartScreen(){
        this.showSubSceneCommon("addPart.fxml", ScreenStates.Modify);
    }

    @FXML
    public void showAddProductScreen(){
        this.showSubSceneCommon("addProduct.fxml", ScreenStates.Modify);
    }

    @FXML
    public void showModifyProductScreen(){
        this.showSubSceneCommon("addProduct.fxml", ScreenStates.Modify);

    }



    public void showSubSceneCommon(String newScreenFXML, ScreenStates state){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(newScreenFXML));
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
        btnAddPart.getScene().getWindow().hide();
    }

    public void returnToMain(){
        blowUp();
    }

}
