package sample;



import javafx.scene.text.Text;



import java.io.File;

import java.io.FileWriter;

import java.io.IOException;



public class Model   {

    public void create(String pathFile, String fileName,String tipeFile, String ceks,String name, String famil, String otch){

        File file = new File(pathFile+"\\"+fileName);

        try {

            FileWriter fr = new FileWriter(pathFile+"\\"+fileName+tipeFile);

            fr.write("Поздравляю"+" "+name+" "+famil+" "+otch+"\n"+"Вы зарегистрированны на курсы:"+ceks);

            fr.close();

        } catch (IOException e) {

            e.printStackTrace();

        }





    }

}