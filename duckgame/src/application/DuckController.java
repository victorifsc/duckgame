package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DuckController {
	
	Duck mallard = new MallardDuck();
	Duck redHead = new RedHeadDuck();
	Duck rubber = new RubberDuck();
	Duck decoy = new DecoyDuck();
	
	Image imgMallard = new Image("./images/mallardduck.jpg");
	Image imgRedHead = new Image("./images/redheadduck.jpg");
	Image imgRubber = new Image("./images/rubberduck.jpg");
	Image imgDecoy = new Image("./images/decoyduck.jpg");
	
	Duck selectedDuck = null;

    @FXML
    private Button btnMallardDuck;

    @FXML
    private Button btnRedHeadDuck;

    @FXML
    private Button btnRubberDuck;

    @FXML
    private Button btnDecoyDuck;

    @FXML
    private Label lblDuckType;

    @FXML
    private Button btnQuack;

    @FXML
    private Button btnSwim;

    @FXML
    private Button btnDisplay;

    @FXML
    private Button btnFly;

    @FXML
    private Label lblResult;
    
    @FXML
    private ImageView imgDuckImage;

    //DUCKS
    
    @FXML
    void onClickMallardDuck(ActionEvent event) {
    	selectedDuck = mallard;
    	lblDuckType.setText("Mallard Duck selected");
    	imgDuckImage.setImage(imgMallard);
    }
    
    @FXML
    void onClickRedHeadDuck(ActionEvent event) {
    	selectedDuck = redHead;
    	lblDuckType.setText("Red Head Duck selected");
    	imgDuckImage.setImage(imgRedHead);
    }
    
    @FXML
    void onClickDecoyDuck(ActionEvent event) {
    	selectedDuck = decoy;
    	lblDuckType.setText("Decoy Duck selected");
    	imgDuckImage.setImage(imgDecoy);
    }

    @FXML
    void onClickRubberDuck(ActionEvent event) {
    	selectedDuck = rubber;
    	lblDuckType.setText("Rubber Duck selected");
    	imgDuckImage.setImage(imgRubber);
    }
    
    //ACTIONS
    
    @FXML
    void onClickQuack(ActionEvent event) {
    	if (selectedDuck != null) {
    		if (selectedDuck instanceof Quackable) {
    			lblResult.setText(((Quackable) selectedDuck).quack());
    		}
    		else {
    			lblResult.setText("No sei quackar");
    		}
    	}
    	else {
    		lblResult.setText("No duck selected");
    	}
    }

    @FXML
    void onClickSwim(ActionEvent event) {
    	if (selectedDuck != null) {
    		if (selectedDuck instanceof Swimable) {
    			lblResult.setText(((Swimable) selectedDuck).swim());
    		}
    		else {
    			lblResult.setText("No sei nadar");
    		}
    	}
    	else {
    		lblResult.setText("No duck selected");
    	}
    }
    
    @FXML
    void onClickFly(ActionEvent event) {
    	if (selectedDuck != null) {
    		if (selectedDuck instanceof Flyable) {
    			lblResult.setText(((Flyable) selectedDuck).fly());
    		}
    		else {
    			lblResult.setText("No sei voar");
    		}
    	}
    	else {
    		lblResult.setText("No duck selected");
    	}
    }
    
    @FXML
    void onClickDisplay(ActionEvent event) {
    	if (selectedDuck != null) {
    		lblResult.setText((selectedDuck).display());
    	}
    	else {
    		lblResult.setText("No duck selected");
    	}
    }
    

    
}
