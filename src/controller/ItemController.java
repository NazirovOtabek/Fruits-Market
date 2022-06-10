package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.Main;
import main.MyListener;
import model.Fruit;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class ItemController {

    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLable;

    @FXML
    private ImageView img;

    @FXML
    private void click(MouseEvent mouseEvent){
    }

    private Fruit fruit;
    private MyListener myListener ;

    public void setData(Fruit fruit,MyListener myListener){

        this.fruit = fruit;
        this.myListener = myListener;
        nameLabel.setText (fruit.getName ());
        priceLable.setText (Main.CURRENCY + fruit.getPrice ());
        Image image = new Image (getClass ().getResourceAsStream (fruit.getImgSrc ()));
        img.setImage (image);
    }

    public void click(javafx.scene.input.MouseEvent mouseEvent) {
        myListener.onClickListener (fruit);

    }
}
