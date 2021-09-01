package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//${javafxCompControls}
public class Ex02 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		ToggleButton tb1 = new ToggleButton("111");
		ToggleButton tb2 = new ToggleButton("222");
		ToggleButton tb3 = new ToggleButton("333");
		
		ToggleGroup tg = new ToggleGroup();	//셋중에 하나만 선택 가능하도록 그룹으로 묶어줌
		tb1.setToggleGroup(tg);
		tb2.setToggleGroup(tg);
		tb3.setToggleGroup(tg);
		
		tb2.setSelected(true);				//프로그램이 실행되자마자 두번째가 자동으로 선택되어있음
		
		hbox.getChildren().addAll(tb1,tb2,tb3);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
