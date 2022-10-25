package calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {

	public static Stage primaryStage;
	private CalculadoraController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		CalculadoraApp.primaryStage = primaryStage;
		controller = new CalculadoraController();
		
		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(new Scene(controller.getView()));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
