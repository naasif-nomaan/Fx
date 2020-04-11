package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.TextFlow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Controller {

    @FXML
     private static AnchorPane anchorPane;

    @FXML
     private static Button click;

    @FXML
     private TextArea text;

    @FXML
    private static Button clearall;


    @FXML
    private ScrollBar sbMain;

    @FXML
    private TextField write;

/*

    public static void setAutoResize(){
        anchorPane.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double value=(double) newValue;
                click.setPrefHeight(value/2);
            }
        });


        anchorPane.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double value=(double) newValue;

                click.setPrefWidth(value/2);
            }
        });
    }
*/





    public void clickOnButton_click(ActionEvent event) {


       /* String st=" \"clickOnButton_click\" ";
        text.appendText(" This is from "+st+" function ");
        text.appendText(" Click one me clicked \n");
*/

        text.appendText(write.getText().toString()+"\n");
    }
    public void clickOnButton_clearall(ActionEvent event) {
       write.clear();

    }

    public void setText(String texts) {
        //this.text.appendText(texts);
    }








}
