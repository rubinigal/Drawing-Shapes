import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
// Copy paste from site so the ui will work
public class Shapes extends Application{
	
	public void start(Stage stage) throws Exception{
		Parent root = (Parent)
		FXMLLoader.load(getClass().getResource("Shapes.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Shapes");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
		System.out.println();
	}
}
