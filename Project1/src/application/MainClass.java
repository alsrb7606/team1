package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application{
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("fxml.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("테스트화면");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
