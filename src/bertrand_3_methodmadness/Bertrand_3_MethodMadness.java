/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bertrand_3_methodmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author Kriber
 */
public class Bertrand_3_MethodMadness extends Application {

    public static void main(String[] args) {
        launch(args);
    }

        @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1024, 768);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.FUCHSIA);
        gc.setStroke(Color.FUCHSIA);
        gc.setLineWidth(3);
        gc.strokeLine(0, 768, 345, 420);
        gc.strokeLine(345, 250, 800,420);
        gc.strokeLine(800, 250, 345,420);
        gc.strokeLine(345, 420, 345,768);
        gc.strokeLine(0, 768, 345,768);
        gc.strokeLine(345, 250, 800,250);
        gc.strokeLine(345, 420, 345,250);
        gc.strokeLine(800, 420, 800,250);
    }
}