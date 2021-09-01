package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//${javafxCompControls}
public class Quiz02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox();
		
		//search 이미지와 글씨
		FlowPane search = new FlowPane();
		
		Label lb = new Label();
		lb.setText("Search");
		lb.setTextFill(Color.web("#0076a3"));
		lb.setGraphic(new ImageView("/img/search.png")); 
		lb.setFont(new Font("CALIBRI",30));
		
		lb.setOnMouseEntered(e->{
			lb.setScaleX(1.5);
			lb.setScaleY(1.5);
		});
		lb.setOnMouseExited(e->{
			lb.setScaleX(1.0);
			lb.setScaleY(1.0);
		});
		
		search.setMaxSize(150, 150);
		search.getChildren().addAll(lb);
		
		//values 글씨
		FlowPane values = new FlowPane();
		
		Label lb2 = new Label();
		lb2.setText("values");
		lb2.setFont(new Font("CALIBRI",50));
		lb2.setRotate(270);
		lb2.setTranslateY(60);
		
		lb2.setOnMouseEntered(e->{
			lb2.setScaleX(1.5);
			lb2.setScaleY(1.5);
		});
		lb2.setOnMouseExited(e->{
			lb2.setScaleX(1.0);
			lb2.setScaleY(1.0);
		});
		
		values.setMaxSize(150, 150);
		values.getChildren().addAll(lb2);
		
		
		//wrapped 글씨
		//FlowPane wrapped = new FlowPane();
		
		Label lb3 = new Label();
		lb3.setText("A label that needs to be wrapped");
		lb3.setFont(new Font(15));
		lb3.setPadding(new Insets(50,20,0,0));
		lb3.setWrapText(true);
		
		lb3.setOnMouseEntered(e->{
			lb3.setScaleX(1.5);
			lb3.setScaleY(1.5);
		});
		lb3.setOnMouseExited(e->{
			lb3.setScaleX(1.0);
			lb3.setScaleY(1.0);
		});
		
		//wrapped.setMaxSize(100, 100);
		//wrapped.getChildren().addAll(lb3);
		
		
		hbox.getChildren().addAll(search,values,lb3);
		hbox.setPrefSize(450, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
