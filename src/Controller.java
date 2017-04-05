import animal.Animal;
import animal.Sex;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;


/**
 * Created by User on 10.03.2017.
 */
public class Controller {

    @FXML
    TextField tf1;
    @FXML
    TextField tf2;
    @FXML
    CheckBox sex1;

    public void okPressed (ActionEvent event){

    String name1 = tf1.getText();
    String name2 = tf2.getText();
    Sex sex;
        tf1.setText("");
        tf2.setText("");

    if (sex1.isSelected()){
        sex = Sex.M;
    }else {sex = Sex.K;
    }


    View.zooMenager.addAnimal(new Animal(name1, name2, sex));
        System.out.println(name1 + "    " + name2 +" " + sex);
    }



    public void cancelPressed (ActionEvent event){
        Platform.exit();

    }
}