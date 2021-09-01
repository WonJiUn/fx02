package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//${javafxCompControls}
public class Ex03 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox();
		ToggleButton tb1 = new ToggleButton("내용", new ImageView("/img/magi.png"));
		//img폴더 복사해서 src누르고 컨트롤 v
		ToggleButton tb2 = new ToggleButton();
		tb2.setGraphic(new ImageView("/img/magi.png")); //글씨없이 그림만
		
		hbox.getChildren().addAll(tb1,tb2);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
