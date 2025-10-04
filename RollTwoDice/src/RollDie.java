

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.paint.Color;

public class RollDie extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPrefSize(300, 200);

        Random rand = new Random();

        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int sum = die1 + die2;

        JIGraphicsUtility.drawDie(pane, 50, 50, die1, Color.WHITE, Color.BLACK);
        JIGraphicsUtility.drawDie(pane, 150, 50, die2, Color.WHITE, Color.BLACK);

        // Show sum
        Text sumText = new Text(100, 150, "Sum of dice: " + sum);
        sumText.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        pane.getChildren().add(sumText);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Roll Two Dice");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}