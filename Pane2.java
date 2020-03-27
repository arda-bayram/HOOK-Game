/*AHMET HAMZA DEMÝR - 150116025
 *ARDA BAYRAM - 150116029
 *
 *In this class we created Level 2.
 */

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Pane2 extends Pane { //Design Level 2

	//Create shapes
	Circle circle1 = new Circle(100, 450, 20, Color.BLACK);
	Line line11 = new Line(100, 450, 100, 100);
	Line line12 = new Line(100, 100, 110, 100);
	Line line13 = new Line(110, 90, 110, 110);
	Line line14 = new Line(110, 100, 205, 100);

	Circle circle2 = new Circle(200, 450, 20, Color.BLACK);
	Line line21 = new Line(200, 450, 200, 350);
	Line line22 = new Line(190, 350, 210, 350);
	Line line23 = new Line(200, 350, 200, 270);
	Arc arc2 = new Arc(200, 250, 20, 20, 90, 180);
	Line line24 = new Line(200, 230, 200, 120);
	Arc arc22 = new Arc(200, 100, 20, 20, 90, -180);
	Line line25 = new Line(200, 80, 200, 60);

	Circle circle3 = new Circle(300, 450, 20, Color.BLACK);
	Line line31 = new Line(300, 450, 300, 350);
	Line line32 = new Line(290, 350, 310, 350);
	Line line33 = new Line(300, 350, 300, 245);

	Circle circle4 = new Circle(450, 450, 20, Color.BLACK);
	Line line41 = new Line(450, 450, 450, 250);
	Line line42 = new Line(450, 250, 440, 250);
	Line line43 = new Line(440, 240, 440, 260);
	Line line44 = new Line(440, 250, 320, 250);
	Arc arc4 = new Arc(300, 250, 20, 20, 180, -180);
	Line line45 = new Line(275, 250, 195, 250);

	//Create buttons
	Button rest = new Button("Try Again");
	Button next = new Button("Next Level");

	public Pane2() {

		//Set properties of shapes
		line13.setStrokeWidth(5);
		line14.setStrokeWidth(5);
		line22.setStrokeWidth(5);
		line23.setStrokeWidth(5);
		arc2.setStrokeWidth(5);
		arc2.setType(ArcType.OPEN);
		arc2.setFill(Color.ALICEBLUE);
		arc2.setStroke(Color.BLACK);
		line24.setStrokeWidth(5);
		arc22.setStrokeWidth(5);
		arc22.setType(ArcType.OPEN);
		arc22.setFill(Color.ALICEBLUE);
		arc22.setStroke(Color.BLACK);
		line25.setStrokeWidth(5);
		line32.setStrokeWidth(5);
		line33.setStrokeWidth(5);
		line43.setStrokeWidth(5);
		line44.setStrokeWidth(5);
		arc4.setStrokeWidth(5);
		arc4.setType(ArcType.OPEN);
		arc4.setFill(Color.ALICEBLUE);
		arc4.setStroke(Color.BLACK);
		line45.setStrokeWidth(5);

		//Add items to scene
		getChildren().addAll(arc2, arc22, arc4, circle1, line11, line12, line13, line14, circle2, line21, line22,
				line23, line24, line25, circle3, line31, line32, line33, circle4, line41, line42, line43, line44,
				line45);

	}

	//Create some variables for movements
	private double increment = 5;
	private double arcInc = 18.5;
	private double incOpa = 0.1;
	private boolean check2 = false;
	private boolean check4 = false;
	private double cons1 = 205;
	private double cons2 = 60;
	private double cons3 = 245;
	private double cons4 = 195;

	public void move1() { //Move a group of shapes

		//Set values for movement
		setCons1(cons1 - increment);

		if (cons1 >= 110) {
			if (line13.getStartY() >= 55)
				line13.setStartY(line13.getStartY() - increment);
			if (line13.getEndY() <= 145)
				line13.setEndY(line13.getEndY() + increment);
			if (line14.getEndX() >= 115)
				line14.setEndX(line14.getEndX() - increment);
		}

		//Control second part of movement
		if (cons1 <= 110) {
			line11.setOpacity(line11.getOpacity() - incOpa);
			line12.setOpacity(line12.getOpacity() - incOpa);
			line13.setStartY(line13.getStartY() + increment);
			line13.setEndY(line13.getEndY() - increment);
			line13.setOpacity(line13.getOpacity() - incOpa);
			line14.setOpacity(line14.getOpacity() - incOpa);
			circle1.setRadius(circle1.getRadius() - 1);
			getChildren().removeAll(line14);

		}

	}

	//Move a group of shapes
	public void move2() {

		//Move a group of shapes
		setCons2(cons2 + increment);

		if (cons2 <= 350) {
			if (line22.getStartX() >= 155)
				line22.setStartX(line22.getStartX() - increment);
			if (line22.getEndX() <= 245)
				line22.setEndX(line22.getEndX() + increment);
			if (line23.getEndY() <= 345)
				line23.setEndY(line23.getEndY() + increment);
			if (arc2.getCenterY() <= 365)
				arc2.setCenterY(arc2.getCenterY() + increment);
			if (arc2.getCenterY() >= 325)
				if (arc2.getLength() >= 0)
					arc2.setLength(arc2.getLength() - arcInc);
			if (line24.getStartY() <= 345)
				line24.setStartY(line24.getStartY() + increment);
			if (line24.getEndY() <= 345)
				line24.setEndY(line24.getEndY() + increment);
			if (arc22.getCenterY() <= 365)
				arc22.setCenterY(arc22.getCenterY() + increment);
			if (arc22.getCenterY() >= 325)
				if (arc22.getLength() <= 0)
					arc22.setLength(arc22.getLength() + arcInc);
			if (line25.getStartY() <= 345)
				line25.setStartY(line25.getStartY() + increment);
			if (line25.getEndY() <= 345)
				line25.setEndY(line25.getEndY() + increment);
		}

		//Check collision situations
		if (arc22.getCenterY() == 120)
			if (line14.getEndX() == 205)
				restart();

		if (arc2.getCenterY() == 270)
			if (line45.getEndX() == 195)
				restart();
			else
				check2 = true;

		//Control second part of movement
		if (cons2 >= 350) {
			line21.setOpacity(line21.getOpacity() - incOpa);
			line22.setStartX(line22.getStartX() + increment);
			line22.setEndX(line22.getEndX() - increment);
			line22.setOpacity(line22.getOpacity() - incOpa);
			line23.setOpacity(line23.getOpacity() - incOpa);
			line24.setOpacity(line24.getOpacity() - incOpa);
			line25.setOpacity(line25.getOpacity() - incOpa);
			arc2.setOpacity(arc2.getOpacity() - incOpa);
			arc22.setOpacity(arc22.getOpacity() - incOpa);
			circle2.setRadius(circle2.getRadius() - 1);
			getChildren().removeAll(line25, line24, arc2, arc22, line23);
		}

		//If there is no collision start next level
		if (check2 && check4)
			if (cons2 >= 475)
				nextLevel();

	}

	//Move a group of shapes
	public void move3() {

		//Set values for movement
		setCons3(cons3 + increment);

		if (cons3 <= 350) {
			if (line32.getStartX() >= 255)
				line32.setStartX(line32.getStartX() - increment);
			if (line32.getEndX() <= 345)
				line32.setEndX(line32.getEndX() + increment);
			if (line33.getEndY() <= 345)
				line33.setEndY(line33.getEndY() + increment);
		}

		//Control second part of movement
		if (cons3 >= 350) {
			line31.setOpacity(line31.getOpacity() - incOpa);
			line32.setStartX(line32.getStartX() + increment);
			line32.setEndX(line32.getEndX() - increment);
			line32.setOpacity(line32.getOpacity() - incOpa);
			line33.setOpacity(line33.getOpacity() - incOpa);
			circle3.setRadius(circle3.getRadius() - 1);
			getChildren().removeAll(line33);

		}

	}

	//Move a group of shapes
	public void move4() {

		//Set values for movement
		setCons4(cons4 + increment);

		if (cons4 <= 440) {
			if (line43.getStartY() >= 205)
				line43.setStartY(line43.getStartY() - increment);
			if (line43.getEndY() <= 295)
				line43.setEndY(line43.getEndY() + increment);
			if (line44.getEndX() <= 435)
				line44.setEndX(line44.getEndX() + increment);
			if (arc4.getCenterX() <= 455)
				arc4.setCenterX(arc4.getCenterX() + increment);
			if (arc4.getCenterX() >= 415)
				if (arc4.getLength() <= 0)
					arc4.setLength(arc4.getLength() + arcInc);
			if (line45.getStartX() <= 435)
				line45.setStartX(line45.getStartX() + increment);
			if (line45.getEndX() <= 435)
				line45.setEndX(line45.getEndX() + increment);
		}

		//Check collision situation
		if (arc4.getCenterX() == 320)
			if (line33.getEndY() == 245)
				restart();
			else
				check4 = true;

		//Control second part of movement
		if (cons4 >= 440) {
			line43.setStartY(line43.getStartY() + increment);
			line43.setEndY(line43.getEndY() - increment);
			line41.setOpacity(line41.getOpacity() - incOpa);
			line42.setOpacity(line42.getOpacity() - incOpa);
			line43.setOpacity(line43.getOpacity() - incOpa);
			line44.setOpacity(line44.getOpacity() - incOpa);
			line45.setOpacity(line45.getOpacity() - incOpa);
			arc4.setOpacity(arc4.getOpacity() - incOpa);
			circle4.setRadius(circle4.getRadius() - 1);
			getChildren().removeAll(line44, arc4, line45);
		}
	}

	//These four methods set values for movements
	public void setCons1(double Cons1) {
		cons1 = Cons1;
	}

	public void setCons2(double Cons2) {
		cons2 = Cons2;
	}

	public void setCons3(double Cons3) {
		cons3 = Cons3;
	}

	public void setCons4(double Cons4) {
		cons4 = Cons4;
	}

	public void nextLevel() { //Start next level
		getChildren().clear();
		getChildren().add(next);
	}

	public void restart() {	//Restart the same level

		getChildren().clear();
		increment = 0;
		getChildren().addAll(arc2, arc22, arc4, circle1, line11, line12, line13, line14, circle2, line21, line22,
				line23, line24, line25, circle3, line31, line32, line33, circle4, line41, line42, line43, line44,
				line45);
		line41.setOpacity(line41.getOpacity() - incOpa * 0.4);
		line42.setOpacity(line42.getOpacity() - incOpa * 0.4);
		line43.setOpacity(line43.getOpacity() - incOpa * 0.4);
		line44.setOpacity(line44.getOpacity() - incOpa * 0.4);
		line45.setOpacity(line45.getOpacity() - incOpa * 0.4);
		arc4.setOpacity(arc4.getOpacity() - incOpa * 0.4);
		line31.setOpacity(line31.getOpacity() - incOpa * 0.4);
		line32.setOpacity(line32.getOpacity() - incOpa * 0.4);
		line33.setOpacity(line33.getOpacity() - incOpa * 0.4);

		line21.setOpacity(line21.getOpacity() - incOpa * 0.4);
		line22.setOpacity(line22.getOpacity() - incOpa * 0.4);
		line23.setOpacity(line23.getOpacity() - incOpa * 0.4);
		line24.setOpacity(line24.getOpacity() - incOpa * 0.4);
		line25.setOpacity(line25.getOpacity() - incOpa * 0.4);
		arc2.setOpacity(arc2.getOpacity() - incOpa * 0.4);
		arc22.setOpacity(arc22.getOpacity() - incOpa * 0.4);

		line11.setOpacity(line11.getOpacity() - incOpa * 0.4);
		line12.setOpacity(line12.getOpacity() - incOpa * 0.4);
		line13.setOpacity(line13.getOpacity() - incOpa * 0.4);
		line14.setOpacity(line14.getOpacity() - incOpa * 0.4);

		circle1.setOpacity(circle1.getOpacity() - incOpa * 0.4);
		circle2.setOpacity(circle2.getOpacity() - incOpa * 0.4);
		circle3.setOpacity(circle3.getOpacity() - incOpa * 0.4);
		circle4.setOpacity(circle4.getOpacity() - incOpa * 0.4);

		if (circle1.getOpacity() - incOpa * 0.4 <= 0) {
			getChildren().clear();
			getChildren().add(rest);
		}
	}
}
