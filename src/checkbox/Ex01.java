package checkbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//${javafxCompControls}
public class Ex01 extends Application {
	//프로젝트 처음 만들면 자바Fx를 프로젝트에 추가해줘야함
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		VBox vbox = new VBox(10);	//안쪽 사이 거리
		CheckBox chk1 = new CheckBox("chk1");
		CheckBox chk2 = new CheckBox("chk2");
		
		chk2.setSelected(true); 	//시작하자마자 기본값으로 체크박스가 선택되어있음
		
		chk1.setText("오락");
		chk2.setText("게임");
		
		vbox.getChildren().addAll(chk1, chk2);
		
		arg0.setScene(new Scene(vbox,300,200));
		arg0.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
