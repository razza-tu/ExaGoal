import javafx.application.Application;
import javafx.stage.Stage;

public class ExaGoalApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
         primaryStage.setTitle("ExaGoal");
         primaryStage.show();
    }

    public static void main(String args[]) {
        Application.launch(args);
    }
}