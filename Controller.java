package sample;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Controller extends Model {

    Model model = new Model();
    @FXML
    private TextField name ;
    @FXML
    private TextField famil;
    @FXML
    private TextField otch;
    @FXML
    private TextField fileName;
    @FXML
    private TextField pathFile;
    @FXML
    private Text controlText;
    private String ceks = "S";
    private String tipeFile;



    public void cek(ActionEvent event){
        ceks += ((CheckBox)event.getSource()).getText()+ " ";
    }
    public void cek1(ActionEvent event){
        tipeFile = ((RadioButton)event.getSource()).getText();
    }
    public void cek2(ActionEvent event){
        if (!name.equals(null)){
            model.create(pathFile.getText(),fileName.getText(),tipeFile,ceks,name.getText(),famil.getText(),otch.getText());
            controlText.setText("Вы успешно зарегистрированы");
        }else controlText.setText("Некоректное введение данных");

    }
    public void open(ActionEvent event) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        File file1 = new File(pathFile.getText()+"\\"+ fileName.getText()+tipeFile);
        if (!(file1==null)){
            desktop.open(file1);
        }
    }
    public void path(ActionEvent event){
        DirectoryChooser dirChooser = new DirectoryChooser();
        dirChooser.setTitle("выбери дир");
        File dir = dirChooser.showDialog(new Stage());

        if (!(dir == null)){
            pathFile.setText(dir.getAbsolutePath());
        }

    }

}