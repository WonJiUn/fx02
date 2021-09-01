package label;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//${javafxCompControls}
public class Ex04 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		AnchorPane anch = new AnchorPane();
		Label lbl = new Label("Value");
		
		lbl.setFont(new Font(32));
		lbl.setRotate(48);
		lbl.setTranslateX(100);
		lbl.setTranslateY(70);
		
		//람다식 없이 사용하는법. 바깥에서 객체생성
		EventHandler<MouseEvent> entered = new EventHandler<MouseEvent>() {
			//alt + shift + s -> handle오버라이드 필요
			@Override
			public void handle(MouseEvent arg0) {
				lbl.setScaleX(1.5); 	//원래 크기보다 X,Y축으로 1.5배 커짐
				lbl.setScaleY(1.5);
			}
		};
		
		lbl.setOnMouseEntered(entered);
		
		//위의 두 식을 변수를 없애고 객체를 안에서 생성 -> 약간 간소화함(람다식은 사용하지않음)
		lbl.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				lbl.setScaleX(1.0); 	
				lbl.setScaleY(1.0);
			}
		});
		
		//람다식을 사용하여 더 간소화
		lbl.setOnMousePressed(e->{
			lbl.setRotate(0);
		});
		
		anch.getChildren().addAll(lbl);
		anch.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(anch));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
