package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//${javafxCompControls}
public class Ex03 extends Application {
	static int i = 0;

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		
		Label lbl = new Label("A label that needs to be wrapped");
		
		/*
		FlowPane fp = new FlowPane();
		fp.getChildren().addAll(lbl);
		팬에 넣어서 할 경우 글자도 창크기와 관계없이 고정시킬 수 있다*/
		
		hbox.getChildren().addAll(lbl);
		hbox.setPrefSize(100, 200);
		
		lbl.setWrapText(true);
		//글씨가 창 안에서 넘쳐서 ...으로 표현될시 아랫줄로 자동 줄바꿈하여 한화면에 표현해줌
		lbl.setFont(new Font(20));
		//폰트 크기
		lbl.setRotate(45);
		//글씨 회전
		lbl.setTranslateY(50);
		//글씨의 Y축을 괄호안 숫자만큼 내려줌
		
		
		//변수 i를 밖에다가 스태틱 변수로 만들지 않으면 동작하지않음
		lbl.setOnMouseClicked(e->{
			if(i == 0) {
				lbl.setRotate(0);
				lbl.setTranslateY(0);
				i= 1;
			}else {
				lbl.setRotate(45);
				lbl.setTranslateY(50);
				i = 0;
			}
		});
		//마우스 클릭이 있으면 괄호안에 이벤트를 실행
		//e-> : 람다식
		
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
