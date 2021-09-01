package radio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox(10);
		RadioButton rd1 = new RadioButton("rb1");	//동그란 모양의 체크버튼
		RadioButton rd2 = new RadioButton("rb2");
		
		hbox.getChildren().addAll(rd1,rd2);
		hbox.setPrefSize(300, 200);
		
		ToggleGroup tg = new ToggleGroup();		//동그란 체크버튼은 보통 여러개중에 하나만 체크하는 식으로 사용하기 때문에
		rd1.setToggleGroup(tg);					//토글그룹을 만들어서 묶어주면 그렇게 사용 가능
		rd2.setToggleGroup(tg);
		
		rd1.setText("10대");
		rd1.setSelected(true); 					//이런 체크박스는 보통 디폴트값으로 하나가 체크되어 나온다
		
		hbox.setPadding(new Insets(20));		//모든 방향으로 20씩 간격이 떨어진다(패딩 : 실행창 기준으로 안쪽 여백을 준다)
		hbox.setStyle("-fx-background-color:skyblue");
		
		HBox.setMargin(rd2, new Insets(50,20,20,50));//마진 : 괄호 안 1번값(rd2)을 기준으로 바깥으로 여백을 준다
		
		arg0.setScene(new Scene(hbox));
		
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
