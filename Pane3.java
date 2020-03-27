/*AHMET HAMZA DEMÝR - 150116025
 *ARDA BAYRAM - 150116029
 *
 *In this class we created Level 3.
 */

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Pane3 extends Pane { //Design Level 3

	//Create shapes
	Circle circle1 = new Circle(100, 350, 20, Color.BLACK);
	Line line11 = new Line(100, 350, 585, 350);
	Line line12 = new Line(585, 350, 585, 325);
	Line line13 = new Line(575, 325, 595, 325);
	Line line14 = new Line(585, 325, 585, 220);
	Arc arc1 = new Arc(585, 200, 20, 20, 90, -180);
	Line line15 = new Line(585, 180, 585, 95);

	Circle circle2 = new Circle(200, 400, 20, Color.BLACK);
	Line line21 = new Line(200, 400, 450, 400);
	Line line22 = new Line(450, 400, 450, 200);
	Line line23 = new Line(450, 200, 475, 200);
	Line line24 = new Line(475, 190, 475, 210);
	Line line25 = new Line(475, 200, 590, 200);
	Circle circle3 = new Circle(350, 450, 20, Color.BLACK);
	Line line31 = new Line(350, 450, 350, 100);
	Line line32 = new Line(350, 100, 375, 100);
	Line line33 = new Line(375, 90, 375, 110);
	Line line34 = new Line(375, 100, 565, 100);
	Arc arc3 = new Arc(585, 100, 20, 20, 0, 180);
	Line line35 = new Line(605, 100, 675, 100);

	//Create buttons
	Button rest = new Button("Try Again");
	Button next = new Button("Next Level");

	public Pane3() {

		//Set properties of shapes
		line13.setStrokeWidth(6);
		line14.setStrokeWidth(6);
		arc1.setStrokeWidth(6);
		arc1.setType(ArcType.OPEN);
		arc1.setFill(Color.ALICEBLUE);
		arc1.setStroke(Color.BLACK);
		line15.setStrokeWidth(6);
		line24.setStrokeWidth(6);
		line25.setStrokeWidth(6);
		line33.setStrokeWidth(6);
		line34.setStrokeWidth(6);
		arc3.setStrokeWidth(6);
		arc3.setType(ArcType.OPEN);
		arc3.setFill(Color.ALICEBLUE);
		arc3.setStroke(Color.BLACK);
		line35.setStrokeWidth(6);

		//Add items to scene
		getChildren().addAll(circle1, circle2, circle3, line11, line12, line21, line22, line23, line31, line32, line13,
				line24, line33, line34, arc3, line35, line14, arc1, line15, line25);

	}

	//Create some variables for movements
	private double increment = 5;
	private double arcInc = 18.5;
	private double incOpa = 0.1;
	private boolean check1 = false;
	private boolean check3 = false;
	private double cons1 = 95;
	private double cons2 = 590;
	private double cons3 = 675;

	public void move1() { //Move a group of shapes

		//Set values for movement
		setCons1(cons1 + increment);

		if (cons1 <= 325) {
			if (line13.getEndX() <= 630)
				line13.setEndX(line13.getEndX() + increment);
			if (line13.getStartX() >= 540)
				line13.setStartX(line13.getStartX() - increment);
			if (line14.getEndY() <= 320)
				line14.setEndY(line14.getEndY() + increment);
			if (arc1.getCenterY() <= 340)
				arc1.setCenterY(arc1.getCenterY() + increment);
			if (arc1.getCenterY() >= 300)
				if (arc1.getLength() <= 0)
					arc1.setLength(arc1.getLength() + arcInc);
			if (line15.getStartY() <= 320)
				line15.setStartY(line15.getStartY() + increment);
			if (line15.getEndY() <= 320)
				line15.setEndY(line15.getEndY() + increment);
		}

		//Check collision situations
		if (arc1.getCenterY() == 220)
			if (line25.getEndX() == 590) {
				restart();
			}
			else
				check1 = true;

		//Control second part of movement
		if (cons1 >= 325) {
			line11.setOpacity(line11.getOpacity() - incOpa);
			line12.setOpacity(line12.getOpacity() - incOpa);
			line13.setStartX(line13.getStartX() + increment);
			line13.setEndX(line13.getEndX() - increment);
			line13.setOpacity(line13.getOpacity() - incOpa);
			line14.setOpacity(line14.getOpacity() - incOpa);
			line15.setOpacity(line15.getOpacity() - incOpa);
			arc1.setOpacity(arc1.getOpacity() - incOpa);
			circle1.setRadius(circle1.getRadius() - 1);
			getChildren().removeAll(line14, line15, arc1);
		}
	}

	//Move a group of shapes
	public void move2() {

		//Set values for movement
		setCons2(cons2 - increment);

		if (cons2 >= 480) {
			if (line24.getStartY() >= 155)
				line24.setStartY(line24.getStartY() - increment);
			if (line24.getEndY() <= 245)
				line24.setEndY(line24.getEndY() + increment);
			if (line25.getEndX() >= 480)
				line25.setEndX(line25.getEndX() - increment);
		}

		//Control second part of movement
		if (cons2 <= 480) {
			line21.setOpacity(line21.getOpacity() - incOpa);
			line22.setOpacity(line22.getOpacity() - incOpa);
			line23.setOpacity(line23.getOpacity() - incOpa);
			line24.setStartY(line24.getStartY() + increment);
			line24.setEndY(line24.getEndY() - increment);
			line24.setOpacity(line24.getOpacity() - incOpa);
			line25.setOpacity(line25.getOpacity() - incOpa);
			circle2.setRadius(circle2.getRadius() - 1);
			getChildren().removeAll(line25);
		}

	}

	//Move a group of shapes
	public void move3() {

		//Set values for movement
		setCons3(cons3 - increment);

		if (cons3 >= 375) {
			if (line33.getStartY() >= 55)
				line33.setStartY(line33.getStartY() - increment);
			if (line33.getEndY() <= 145)
				line33.setEndY(line33.getEndY() + increment);
			if (line34.getEndX() >= 380)
				line34.setEndX(line34.getEndX() - increment);
			if (arc3.getCenterX() >= 360)
				arc3.setCenterX(arc3.getCenterX() - increment);
			if (arc3.getCenterX() <= 400)
				if (arc3.getLength() >= 0)
					arc3.setLength(arc3.getLength() - arcInc);
			if (line35.getStartX() >= 380)
				line35.setStartX(line35.getStartX() - increment);
			if (line35.getEndX() >= 380)
				line35.setEndX(line35.getEndX() - increment);
		}

		//Check collision situations
		if (arc3.getCenterX() == 565)
			if (line15.getEndY() == 95)
				restart();
			else
				check3 = true;

		//Control second part of movement
		if (cons3 <= 375) {
			line31.setOpacity(line31.getOpacity() - incOpa);
			line32.setOpacity(line32.getOpacity() - incOpa);
			line33.setStartY(line33.getStartY() + increment);
			line33.setEndY(line33.getEndY() - increment);
			line33.setOpacity(line33.getOpacity() - incOpa);
			line34.setOpacity(line34.getOpacity() - incOpa);
			line35.setOpacity(line35.getOpacity() - incOpa);
			arc3.setOpacity(arc3.getOpacity() - incOpa);
			circle3.setRadius(circle3.getRadius() - 1);
			getChildren().removeAll(line34, line35, arc3);
		}

		//If there is no collision start next level
		if (check1 && check3)
			if (cons3 <= 250)
				nextLevel();

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

	public void nextLevel() { //Start next level
		getChildren().clear();
		getChildren().add(next);

	}

	public void restart() {	//Restart the same level

		getChildren().clear();
		increment = 0;
		getChildren().addAll(circle1, circle2, circle3, line11, line12, line21, line22, line23, line31, line32, line13,
				line24, line33, line34, arc3, line35, line14, arc1, line15, line25);

		line11.setOpacity(line11.getOpacity() - incOpa * 0.4);
		line12.setOpacity(line12.getOpacity() - incOpa * 0.4);
		line13.setOpacity(line13.getOpacity() - incOpa * 0.4);
		line14.setOpacity(line14.getOpacity() - incOpa * 0.4);
		line15.setOpacity(line15.getOpacity() - incOpa * 0.4);
		arc1.setOpacity(arc1.getOpacity() - incOpa * 0.4);
		circle1.setOpacity(circle1.getOpacity() - incOpa * 0.4);

		line21.setOpacity(line21.getOpacity() - incOpa * 0.4);
		line22.setOpacity(line22.getOpacity() - incOpa * 0.4);
		line23.setOpacity(line23.getOpacity() - incOpa * 0.4);
		line24.setOpacity(line24.getOpacity() - incOpa * 0.4);
		line25.setOpacity(line25.getOpacity() - incOpa * 0.4);
		circle2.setOpacity(circle2.getOpacity() - incOpa * 0.4);

		line31.setOpacity(line31.getOpacity() - incOpa * 0.4);
		line32.setOpacity(line32.getOpacity() - incOpa * 0.4);
		line33.setOpacity(line33.getOpacity() - incOpa * 0.4);
		line34.setOpacity(line34.getOpacity() - incOpa * 0.4);
		line35.setOpacity(line35.getOpacity() - incOpa * 0.4);
		arc3.setOpacity(arc3.getOpacity() - incOpa * 0.4);
		circle3.setOpacity(circle3.getOpacity() - incOpa * 0.4);

		if (circle1.getOpacity() - incOpa * 0.4 <= 0) {
			getChildren().clear();
			getChildren().add(rest);
		}
	}
}
