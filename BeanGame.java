//U10416005ªL«Ø¦t

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class BeanGame extends Application{
	@Override
	public void start(Stage primaryStage){
		Scene scene = new Scene(new LinePane(),200,200);
		primaryStage.setTitle("BeanGame");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

class LinePane extends Pane{
	public LinePane(){
		Line line1 = new Line(120,0,200,200);
		line1.setStrokeWidth(1);
		line1.setStroke(Color.BLACK);
		getChildren().add(line1);
		
		Line line2 = new Line(80,0,0,200);
		line2.setStrokeWidth(1);
		line2.setStroke(Color.BLACK);
		getChildren().add(line2);
	}
}