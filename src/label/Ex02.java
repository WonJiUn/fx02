package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//${javafxCompControls}
public class Ex02 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		Label lbl = new Label("라벨",new ImageView("/img/search.png"));
		//라벨에 그림과 글씨를 동시에 올릴 수 있다
		
		Label lbl02 = new Label();
		lbl02.setText("search");				//텍스트, 색깔, 이미지등을 나중에 초기화해줄수도 있다.
		lbl02.setTextFill(Color.web("#0076a3"));
		lbl02.setGraphic(new ImageView("/img/search.png"));
		
		hbox.getChildren().addAll(lbl,lbl02);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
