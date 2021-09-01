package textfield;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//${javafxCompControls}
public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		TextField tf = new TextField();			//입력할 수 있는 텍스트박스(내용이 보임)
		
		tf.setText("test");
		
		hbox.setPadding(new Insets(20));
		
		PasswordField pf = new PasswordField(); //입력할 수 있는 텍스트박스(내용이 안보임)
		pf.setText("abcd1234");
		
		ComboBox<String> cb = new ComboBox<String>();	//누르면 선택할 수 있는 항목이 아래쪽으로 나열되는 박스
		cb.getItems().addAll("공부","놀기","멍타기");
		cb.setValue("공부");
		
		TextArea ta = new TextArea();			//여러줄 입력할 수 있는 텍스트박스
		ta.setPrefSize(100, 100);
		
		DatePicker dp = new DatePicker();		//달력에서 날짜 선택
		
		hbox.getChildren().addAll(tf,pf,cb,ta,dp);
		hbox.setPrefSize(700, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
