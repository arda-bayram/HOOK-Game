/*AHMET HAMZA DEMÝR - 150116025
 *ARDA BAYRAM - 150116029
 *
 *In this class we created Level 5.
 */

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Pane5 extends Pane { // Design Level 5

	// Create some boolean variables for conductors
	private boolean conT1 = true;
	private boolean conT2 = true;
	private boolean conT21 = false;
	private boolean conT22 = false;
	private boolean conT23 = false;

	// Create shapes
	Circle circle1 = new Circle(100, 300, 20, Color.BLACK);
	Line line11 = new Line(100, 300, 230, 300);
	Line line12 = new Line(270, 300, 370, 300);
	Line line13 = new Line(370, 300, 370, 290);
	Line line14 = new Line(360, 290, 380, 290);
	Line line15 = new Line(370, 290, 370, 190);
	Arc arc1 = new Arc(370, 170, 20, 20, 90, 180);
	Line line16 = new Line(370, 150, 370, 105);

	Circle circle2 = new Circle(100, 400, 20, Color.BLACK);
	Line line21 = new Line(100, 400, 230, 400);
	Line line22 = new Line(270, 400, 480, 400);
	Line line23 = new Line(480, 400, 480, 390);
	Line line24 = new Line(470, 390, 490, 390);
	Line line25 = new Line(480, 390, 480, 130);
	Arc arc2 = new Arc(480, 110, 20, 20, 90, -180);
	Line line26 = new Line(480, 90, 480, 60);

	Circle circle3 = new Circle(250, 500, 20, Color.BLACK);
	Line line31 = new Line(250, 500, 250, 420);
	Line line32 = new Line(250, 380, 250, 320);
	Line line33 = new Line(250, 280, 250, 110);
	Line line34 = new Line(250, 110, 260, 110);
	Line line35 = new Line(260, 100, 260, 120);
	Line line36 = new Line(260, 110, 350, 110);
	Arc arc3 = new Arc(370, 110, 20, 20, 0, 180);
	Line line37 = new Line(390, 110, 485, 110);

	Circle circle4 = new Circle(450, 500, 20, Color.BLACK);
	Line line41 = new Line(450, 500, 450, 170);
	Line line42 = new Line(450, 170, 440, 170);
	Line line43 = new Line(440, 180, 440, 160);
	Line line44 = new Line(440, 170, 365, 170);

	Circle con1 = new Circle(250, 300, 20, Color.BLACK);
	Line cLine1 = new Line(250, 280, 250, 320);
	Line cLine12 = new Line(230, 300, 270, 300);
	Circle con2 = new Circle(250, 400, 20, Color.BLACK);
	Line cLine2 = new Line(230, 400, 270, 400);
	Line cLine22 = new Line(250, 380, 250, 420);

	// Create buttons
	Button rest = new Button("Try Again");
	Button next = new Button("Next Level");

	public Pane5() {

		// Set properties of shapes
		line14.setStrokeWidth(6);
		line15.setStrokeWidth(6);
		arc1.setStrokeWidth(6);
		arc1.setType(ArcType.OPEN);
		arc1.setFill(Color.ALICEBLUE);
		arc1.setStroke(Color.BLACK);
		line16.setStrokeWidth(6);
		line24.setStrokeWidth(6);
		line25.setStrokeWidth(6);
		arc2.setStrokeWidth(6);
		arc2.setType(ArcType.OPEN);
		arc2.setFill(Color.ALICEBLUE);
		arc2.setStroke(Color.BLACK);
		line26.setStrokeWidth(6);
		line35.setStrokeWidth(6);
		line36.setStrokeWidth(6);
		arc3.setStrokeWidth(6);
		arc3.setType(ArcType.OPEN);
		arc3.setFill(Color.ALICEBLUE);
		arc3.setStroke(Color.BLACK);
		line37.setStrokeWidth(6);
		line43.setStrokeWidth(6);
		line44.setStrokeWidth(6);
		con1.setFill(Color.ALICEBLUE);
		con1.setStroke(Color.BLACK);
		con1.setStrokeWidth(3);
		con2.setFill(Color.ALICEBLUE);
		con2.setStroke(Color.BLACK);
		con2.setStrokeWidth(3);

		// Add items to scene
		getChildren().addAll(circle1, circle2, circle3, circle4, con1, cLine1, con2, cLine2, line11, line21, line31,
				line32, line12, line13, line14, line15, arc1, arc3, arc2, line16, line33, line34, line35, line36,
				line37, line41, line42, line43, line44, line22, line23, line24, line25, line26);
	}

	// Create some variables for movements
	private double increment = 5;
	private double arcInc = 18.5;
	private double incOpa = 0.1;
	private boolean check1 = false;
	private boolean check2 = false;
	private boolean check3 = false;
	private double cons1 = 105;
	private double cons2 = 60;
	private double cons3 = 485;
	private double cons4 = 365;

	public void move1Control() { // Conductor checker
		if (conT1 == false)
			conT21 = true;
		if (conT21)
			move1();

	}

	public void move2Control() { // Conductor checker
		if (conT2)
			conT22 = true;
		if (conT22)
			move2();

	}

	public void move3Control() { // Conductor checker
		if (conT1 && conT2 == false)
			conT23 = true;
		if (conT23)
			move3();

	}

	public void move1() { // Move a group of shapes

		// Set values for movement
		setCons1(cons1 + increment);

		if (cons1 <= 290) {
			if (line14.getStartX() >= 325)
				line14.setStartX(line14.getStartX() - increment);
			if (line14.getEndX() <= 415)
				line14.setEndX(line14.getEndX() + increment);
			if (line15.getEndY() <= 285)
				line15.setEndY(line15.getEndY() + increment);
			if (arc1.getCenterY() <= 305)
				arc1.setCenterY(arc1.getCenterY() + increment);
			if (arc1.getCenterY() >= 265)
				if (arc1.getLength() >= 0)
					arc1.setLength(arc1.getLength() - arcInc);
			if (line16.getStartY() <= 285)
				line16.setStartY(line16.getStartY() + increment);
			if (line16.getEndY() <= 285)
				line16.setEndY(line16.getEndY() + increment);
		}

		//Control second part of movement
		if (cons1 >= 290) {
			line11.setOpacity(line11.getOpacity() - incOpa);
			line12.setOpacity(line12.getOpacity() - incOpa);
			line13.setOpacity(line13.getOpacity() - incOpa);
			line14.setStartX(line14.getStartX() + increment);
			line14.setEndX(line14.getEndX() - increment);
			line14.setOpacity(line14.getOpacity() - incOpa);
			line15.setOpacity(line15.getOpacity() - incOpa);
			line16.setOpacity(line16.getOpacity() - incOpa);
			arc1.setOpacity(arc1.getOpacity() - incOpa);
			circle1.setRadius(circle1.getRadius() - 1);
			getChildren().removeAll(line16, line15, arc1);
		}

		//Check collision situations
		if (arc1.getCenterY() == 190)
			if (line44.getEndX() <= 370)
				restart();
			else
				check1 = true;

	}

	public void move2() { //Move a group of shapes

		//Move a group of shapes
		setCons2(cons2 + increment);

		if (cons2 <= 390) {
			if (line24.getStartX() >= 435)
				line24.setStartX(line24.getStartX() - increment);
			if (line24.getEndX() <= 525)
				line24.setEndX(line24.getEndX() + increment);
			if (line25.getEndY() <= 385)
				line25.setEndY(line25.getEndY() + increment);
			if (arc2.getCenterY() <= 405)
				arc2.setCenterY(arc2.getCenterY() + increment);
			if (arc2.getCenterY() >= 365)
				if (arc2.getLength() <= 0)
					arc2.setLength(arc2.getLength() + arcInc);
			if (line26.getStartY() <= 385)
				line26.setStartY(line26.getStartY() + increment);
			if (line26.getEndY() <= 385)
				line26.setEndY(line26.getEndY() + increment);
		}

		//Control second part of movement
		if (cons2 >= 390) {
			line21.setOpacity(line21.getOpacity() - incOpa);
			line22.setOpacity(line22.getOpacity() - incOpa);
			line23.setOpacity(line23.getOpacity() - incOpa);
			line24.setStartX(line24.getStartX() + increment);
			line24.setEndX(line24.getEndX() - increment);
			line24.setOpacity(line24.getOpacity() - incOpa);
			line25.setOpacity(line25.getOpacity() - incOpa);
			line26.setOpacity(line26.getOpacity() - incOpa);
			arc2.setOpacity(arc2.getOpacity() - incOpa);
			circle2.setRadius(circle2.getRadius() - 1);
			getChildren().removeAll(line25, line26, arc2);
		}

		//Check collision situations
		if (arc2.getCenterY() == 130)
			if (line37.getEndX() == 485)
				restart();
			else
				check2 = true;

		//If there is no collision start next level
		if (check1 && check2 && check3)
			if (cons2 >= 390)
				nextLevel();

	}

	public void move3() { //Move a group of shapes

		//Move a group of shapes
		setCons3(cons3 - increment);

		if (cons3 >= 260) {
			if (line35.getStartY() >= 65)
				line35.setStartY(line35.getStartY() - increment);
			if (line35.getEndY() <= 155)
				line35.setEndY(line35.getEndY() + increment);
			if (line36.getEndX() >= 265)
				line36.setEndX(line36.getEndX() - increment);
			if (arc3.getCenterX() >= 245)
				arc3.setCenterX(arc3.getCenterX() - increment);
			if (arc3.getCenterX() <= 285)
				if (arc3.getLength() >= 0)
					arc3.setLength(arc3.getLength() - arcInc);
			if (line37.getStartX() >= 265)
				line37.setStartX(line37.getStartX() - increment);
			if (line37.getEndX() >= 265)
				line37.setEndX(line37.getEndX() - increment);
		}

		//Control second part of movement
		if (cons3 <= 260) {
			line31.setOpacity(line31.getOpacity() - incOpa);
			line32.setOpacity(line32.getOpacity() - incOpa);
			line33.setOpacity(line33.getOpacity() - incOpa);
			line34.setOpacity(line34.getOpacity() - incOpa);
			line35.setStartY(line35.getStartY() + increment);
			line35.setEndY(line35.getEndY() - increment);
			line35.setOpacity(line35.getOpacity() - incOpa);
			line36.setOpacity(line36.getOpacity() - incOpa);
			line37.setOpacity(line37.getOpacity() - incOpa);
			arc3.setOpacity(arc3.getOpacity() - incOpa);
			circle3.setRadius(circle3.getRadius() - 1);

			con1.setOpacity(con1.getOpacity() - incOpa * 0.4);
			cLine1.setOpacity(cLine1.getOpacity() - incOpa * 0.4);
			cLine12.setOpacity(cLine12.getOpacity() - incOpa * 0.4);

			getChildren().removeAll(line36, line37, arc3);
		}

		//Check collision situations
		if (arc3.getCenterX() == 350)
			if (line16.getStartY() <= 285)
				restart();
			else
				check3 = true;

	}

	public void move4() { //Move a group of shapes

		//Move a group of shapes
		setCons4(cons4 + increment);

		if (cons4 <= 440) {
			if (line43.getStartY() <= 215)
				line43.setStartY(line43.getStartY() + increment);
			if (line43.getEndY() >= 125)
				line43.setEndY(line43.getEndY() - increment);
			if (line44.getEndX() <= 445)
				line44.setEndX(line44.getEndX() + increment);
		}

		//Control second part of movement
		if (cons4 >= 440) {
			line43.setStartY(line43.getStartY() - increment);
			line43.setEndY(line43.getEndY() + increment);
			line41.setOpacity(line41.getOpacity() - incOpa);
			line42.setOpacity(line42.getOpacity() - incOpa);
			line43.setOpacity(line43.getOpacity() - incOpa);
			line44.setOpacity(line44.getOpacity() - incOpa);
			circle4.setRadius(circle4.getRadius() - 1);
			getChildren().removeAll(line44);

		}

	}

	public void moveCon1() { //Conductor movement

		if (conT1) {
			getChildren().remove(cLine1);
			getChildren().add(cLine12);
			conT1 = false;
		} else {
			getChildren().remove(cLine12);
			getChildren().add(cLine1);
			conT1 = true;
		}

	}

	public void moveCon2() { //Conductor movement

		if (conT2) {
			getChildren().remove(cLine2);
			getChildren().add(cLine22);
			conT2 = false;
		} else {
			getChildren().remove(cLine22);
			getChildren().add(cLine2);
			conT2 = true;
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
		getChildren().addAll(con1, con2);

		if (conT2)
			getChildren().add(cLine2);
		else
			getChildren().add(cLine22);

		con2.setOpacity(con2.getOpacity() - incOpa * 0.7);
		cLine2.setOpacity(cLine2.getOpacity() - incOpa * 0.7);
		cLine22.setOpacity(cLine22.getOpacity() - incOpa * 0.7);

	}

	public void restart() {	//Restart the same level

		getChildren().clear();
		increment = 0;
		getChildren().addAll(circle1, circle2, circle3, circle4, con1, cLine1, con2, cLine2, line11, line21, line31,
				line32, line12, line13, line14, line15, arc1, arc3, arc2, line16, line33, line34, line35, line36,
				line37, line41, line42, line43, line44, line22, line23, line24, line25, line26);

		con1.setOpacity(con1.getOpacity() - incOpa * 0.4);
		con2.setOpacity(con2.getOpacity() - incOpa * 0.4);
		cLine1.setOpacity(cLine1.getOpacity() - incOpa * 0.4);
		cLine12.setOpacity(cLine1.getOpacity() - incOpa * 0.4);
		cLine2.setOpacity(cLine2.getOpacity() - incOpa * 0.4);
		cLine22.setOpacity(cLine1.getOpacity() - incOpa * 0.4);

		line11.setOpacity(line11.getOpacity() - incOpa * 0.4);
		line12.setOpacity(line12.getOpacity() - incOpa * 0.4);
		line13.setOpacity(line13.getOpacity() - incOpa * 0.4);
		line14.setOpacity(line14.getOpacity() - incOpa * 0.4);

		line15.setOpacity(line15.getOpacity() - incOpa * 0.4);
		line16.setOpacity(line16.getOpacity() - incOpa * 0.4);
		arc1.setOpacity(arc1.getOpacity() - incOpa * 0.4);
		circle1.setOpacity(circle1.getOpacity() - incOpa * 0.4);

		line21.setOpacity(line21.getOpacity() - incOpa * 0.4);
		line22.setOpacity(line22.getOpacity() - incOpa * 0.4);
		line23.setOpacity(line23.getOpacity() - incOpa * 0.4);
		line24.setOpacity(line24.getOpacity() - incOpa * 0.4);

		line25.setOpacity(line25.getOpacity() - incOpa * 0.4);
		line26.setOpacity(line26.getOpacity() - incOpa * 0.4);
		arc2.setOpacity(arc2.getOpacity() - incOpa * 0.4);
		circle2.setOpacity(circle2.getOpacity() - incOpa * 0.4);

		line31.setOpacity(line31.getOpacity() - incOpa * 0.4);
		line32.setOpacity(line32.getOpacity() - incOpa * 0.4);
		line33.setOpacity(line33.getOpacity() - incOpa * 0.4);
		line34.setOpacity(line34.getOpacity() - incOpa * 0.4);
		line35.setOpacity(line35.getOpacity() - incOpa * 0.4);

		line36.setOpacity(line36.getOpacity() - incOpa * 0.4);
		line37.setOpacity(line37.getOpacity() - incOpa * 0.4);
		arc3.setOpacity(arc3.getOpacity() - incOpa * 0.4);
		circle3.setOpacity(circle3.getOpacity() - incOpa * 0.4);

		line41.setOpacity(line41.getOpacity() - incOpa * 0.4);
		line42.setOpacity(line42.getOpacity() - incOpa * 0.4);
		line43.setOpacity(line43.getOpacity() - incOpa * 0.4);
		line44.setOpacity(line44.getOpacity() - incOpa * 0.4);
		circle4.setOpacity(circle4.getOpacity() - incOpa * 0.4);

		if (circle1.getOpacity() - incOpa * 0.4 <= 0) {
			getChildren().clear();
			getChildren().add(rest);

		}

	}
}