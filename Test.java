/*AHMET HAMZA DEMÝR - 150116025
 *ARDA BAYRAM - 150116029
 *
 *In this class we test our application.
 */

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Test extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) { //Level 1

		Pane1 pane1 = new Pane1();

		Scene scene = new Scene(pane1, 800, 800); //Create a scene with pane
		primaryStage.setTitle("Level 1"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		//Create timelines for animations
		Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane1.move1()));
		animation1.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane1.circle1.setOnMouseClicked(e -> animation1.play()); //Start animation

		Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane1.move2()));
		animation2.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane1.circle2.setOnMouseClicked(e -> animation2.play()); //Start animation

		pane1.rest.setOnAction(e -> start(primaryStage)); //Restart the level
		pane1.next.setOnAction(e -> next2(primaryStage)); //Start next level

	}

	public void next2(Stage primaryStage) { //Level 2

		Pane2 pane2 = new Pane2(); //Create a pane

		Scene scene = new Scene(pane2, 800, 800); //Create a scene with pane
		primaryStage.setTitle("Level 2"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		//Create timelines for animations
		Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane2.move1()));
		animation1.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane2.circle1.setOnMouseClicked(e -> animation1.play()); //Start animation

		Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane2.move2()));
		animation2.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane2.circle2.setOnMouseClicked(e -> animation2.play()); //Start animation

		Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane2.move3()));
		animation3.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane2.circle3.setOnMouseClicked(e -> animation3.play()); //Start animation

		Timeline animation4 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane2.move4()));
		animation4.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane2.circle4.setOnMouseClicked(e -> animation4.play()); //Start animation

		pane2.rest.setOnAction(e -> next2(primaryStage)); //Restart the level
		pane2.next.setOnAction(e -> next3(primaryStage)); //Start next level

	}

	public void next3(Stage primaryStage) { //Level 3

		Pane3 pane3 = new Pane3(); //Create a pane

		Scene scene = new Scene(pane3, 800, 800); //Create a scene with pane
		primaryStage.setTitle("Level 3"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		//Create timelines for animations
		Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane3.move1()));
		animation1.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane3.circle1.setOnMouseClicked(e -> animation1.play()); //Start animation

		Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane3.move2()));
		animation2.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane3.circle2.setOnMouseClicked(e -> animation2.play()); //Start animation

		Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane3.move3()));
		animation3.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane3.circle3.setOnMouseClicked(e -> animation3.play()); //Start animation

		pane3.rest.setOnAction(e -> next3(primaryStage)); //Restart the level
		pane3.next.setOnAction(e -> next4(primaryStage)); //Start next level

	}

	public void next4(Stage primaryStage) { //Level 4

		Pane4 pane4 = new Pane4(); //Create a pane

		Scene scene = new Scene(pane4, 800, 800); //Create a scene with pane
		primaryStage.setTitle("Level 4"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		//Create timelines for animations
		Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane4.move1Control()));
		animation1.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane4.circle1.setOnMouseClicked(e -> animation1.play()); //Start animation

		pane4.con1.setOnMouseClicked(e -> pane4.moveCon());//Conductor movement

		Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane4.move2Control()));
		animation2.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane4.circle2.setOnMouseClicked(e -> animation2.play()); //Start animation

		pane4.rest.setOnAction(e -> next4(primaryStage)); //Restart the level
		pane4.next.setOnAction(e -> next5(primaryStage)); //Start next level
	}

	public void next5(Stage primaryStage) { //Level 5

		Pane5 pane5 = new Pane5(); //Create a pane

		Scene scene = new Scene(pane5, 800, 800); //Create a scene with pane
		primaryStage.setTitle("Level 5"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		//Conductor movement
		pane5.con1.setOnMouseClicked(e -> pane5.moveCon1());
		pane5.con2.setOnMouseClicked(e -> pane5.moveCon2());

		//Create timelines for animations
		Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane5.move1Control()));
		animation1.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane5.circle1.setOnMouseClicked(e -> animation1.play()); //Start animation

		Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane5.move2Control()));
		animation2.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane5.circle2.setOnMouseClicked(e -> animation2.play()); //Start animation

		Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane5.move3Control()));
		animation3.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane5.circle3.setOnMouseClicked(e -> animation3.play()); //Start animation

		Timeline animation4 = new Timeline(new KeyFrame(Duration.millis(50), e -> pane5.move4()));
		animation4.setCycleCount(Timeline.INDEFINITE); //Reuse the animation for indefinite time
		pane5.circle4.setOnMouseClicked(e -> animation4.play()); //Start animation

		pane5.rest.setOnAction(e -> next5(primaryStage)); //Restart the level

	}

	public static void main(String[] args) {
		launch(args);
	}

}