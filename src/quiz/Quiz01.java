package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//${javafxCompControls}
public class Quiz01 extends Application {

	//각 컴포넌트를 박스에 넣기전에 팬으로 한번 감싸고 넣으면 창을 늘리고 줄이는거와 관계없이 내가 지정해놓은 크기를 고정시킬 수 있다!
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox();
		VBox vbox1 = new VBox(10); 
		VBox vbox2 = new VBox(10); 
		VBox vbox3 = new VBox(); 
		
		//첫번째줄
		Label lb1 = new Label("카테고리");
		Label lb2 = new Label("노트북/pc");
		Label lb3 = new Label("자동차용품");
		Label lb4 = new Label("휴대폰");
		Label lb5 = new Label("캠핑/낚시");
		
		vbox1.getChildren().addAll(lb1,lb2,lb3,lb4,lb5);
		vbox1.setPadding(new Insets(50,5,10,10));
		//vbox1.setPrefSize(100, 100);
		
		//두번째줄 - 아이디 패스워드
		HBox idBox = new HBox(10);
		HBox pwBox = new HBox(4);
		
		Label idLabel = new Label("ID");
		Label pwLabel = new Label("PW");
		
		
		TextField idtf = new TextField();
		PasswordField pwtf = new PasswordField();
		
		idtf.setMaxSize(150, 10);
		pwtf.setMaxSize(150, 10);
		
		idBox.getChildren().addAll(idLabel,idtf);
		pwBox.getChildren().addAll(pwLabel,pwtf);
		
		//두번째줄 - 라디오버튼
		HBox MF = new HBox(22);
		
		RadioButton female = new RadioButton("여");
		RadioButton male = new RadioButton("남");
		
		ToggleGroup tg1 = new ToggleGroup();
		female.setToggleGroup(tg1);
		male.setToggleGroup(tg1);
		female.setSelected(true);
		
		MF.getChildren().addAll(female,male);
		
		//두번째줄 - 체크박스
		HBox gamestudy = new HBox(10);
		
		CheckBox game = new CheckBox("게임");
		CheckBox study = new CheckBox("공부");
		
		gamestudy.getChildren().addAll(game,study);
		
		
		//두번째줄 - 하고싶은말
		VBox taBox = new VBox(10);
		Label taLabel = new Label("하고 싶은 말");
		
		TextArea ta = new TextArea();
		ta.setPrefSize(100, 50);
		
		taBox.getChildren().addAll(taLabel,ta);
		
		
		vbox2.getChildren().addAll(idBox,pwBox,MF,gamestudy,taBox);
		vbox2.setPadding(new Insets(60,5,10,10));
		
		
		//세번째줄 - 메뉴
		HBox menu = new HBox(20);
		
		Label home = new Label("홈");
		Label society = new Label("사회");
		Label economy = new Label("경제");
		Label international = new Label("국제");
		Label culture = new Label("문화");
		
		menu.getChildren().addAll(home,society,economy,international,culture);
		menu.setPadding(new Insets(10,20,35,20));
		
		//세번째줄 - 로그인창
		GridPane gridPane = new GridPane();
		
		TextField login1 = new TextField();
		TextField login2 = new TextField();
		Button login = new Button("로그인");
		
		gridPane.add(login1, 0, 0);
		gridPane.add(login2, 0, 1);
		gridPane.add(login, 1, 0, 1 ,2);
		login.setPrefSize(60, 45);
		login1.setMaxSize(100, 10);
		login2.setMaxSize(100, 10);
		
		gridPane.setAlignment(Pos.TOP_RIGHT);
		gridPane.setPadding(new Insets(0,20,0,0));
		
		
		vbox3.getChildren().addAll(menu,gridPane);
	
		
		hbox.getChildren().addAll(vbox1,vbox2,vbox3);
		hbox.setPrefSize(500, 300);
		
		arg0.setScene(new Scene(hbox));
		arg0.setTitle("Quiz01");
		arg0.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
