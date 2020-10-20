package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

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
}
