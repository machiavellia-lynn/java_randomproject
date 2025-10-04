import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class JIGraphicsUtility {

    public static void drawDie(Pane pane, int x, int y, int value, Color faceColor, Color dotColor) {
        int size = 50;
        double cx = x + size / 2.0, cy = y + size / 2.0, d = size / 4.0;

        Rectangle face = new Rectangle(x, y, size, size);
        face.setFill(faceColor);
        face.setStroke(Color.BLACK);
        pane.getChildren().add(face);

        java.util.function.BiConsumer<Double, Double> dot = (dx, dy) -> {
            pane.getChildren().add(new Circle(cx + dx, cy + dy, 4, dotColor));
        };

        if (value == 1 || value == 3 || value == 5) dot.accept(0.0, 0.0);
        if (value >= 2) {
            dot.accept(-d, -d); dot.accept(d, d);
        }
        if (value >= 4) {
            dot.accept(-d, d); dot.accept(d, -d);
        }
        if (value == 6) {
            dot.accept(-d, 0.0); dot.accept(d, 0.0);
        }
    }
}
