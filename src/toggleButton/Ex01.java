package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//${javafxCompControls}
public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		ToggleButton toggleBtn = new ToggleButton("Toggle Button");	//토글버튼 : 누르면 눌려서 멈춰있는 버튼
		
		hbox.getChildren().addAll(toggleBtn);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
