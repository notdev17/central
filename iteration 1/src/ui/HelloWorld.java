package ui;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class HelloWorld extends Application {
	
	Button testButt;
	
	 public static void main(String[] args) {
	        launch(args);
	    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Hello World");
		
		testButt = new Button("i am a test butt");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(testButt);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
