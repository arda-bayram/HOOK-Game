
/*AHMET HAMZA DEMÝR - 150116025
 *ARDA BAYRAM - 150116029
 *
 *In this class we created Level 4.
 */

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Pane4 extends Pane { // Design Level 4

	// Create some boolean variables for conductors
	private boolean conT = true;
	private boolean conT21 = false;
	private boolean conT22 = false;

	// Create shapes
	Circle circle1 = new Circle(250, 450, 20, Color.BLACK);
	Line line11 = new Line(250, 430, 250, 320);
	Circle con1 = new Circle(250, 300, 20, Color.BLACK);
	Line cLine1 = new Line(250, 280, 250, 320);
	Line cLine2 = new Line(270, 300, 230, 300);
	Line line12 = new Line(250, 280, 250, 80);
	Line line13 = new Line(250, 80, 260, 80);
	Line line14 = new Line(260, 90, 260, 70);
	Line line15 = new Line(260, 80, 460, 80);
	Arc arc1 = new Arc(480, 80, 20, 20, 0, 180);
	Line line16 = new Line(500, 80, 525, 80);

	Circle circle2 = new Circle(100, 300, 20, Color.BLACK);
	Line line21 = new Line(120, 300, 230, 300);
	Line line22 = new Line(270, 300, 480, 300);
	Line line23 = new Line(480, 300, 480, 290);
	Line line24 = new Line(470, 290, 490, 290);
	Line line25 = new Line(480, 290, 480, 75);

	// Create buttons
	Button rest = new Button("Try Again");
	Button next = new Button("Next Level");

	public Pane4() {

		// Set properties of shapes
		con1.setFill(Color.ALICEBLUE);
		con1.setStroke(Color.BLACK);
		con1.setStrokeWidth(3);
		line14.setStrokeWidth(6);
		line15.setStrokeWidth(6);
		arc1.setStrokeWidth(6);
		arc1.setType(ArcType.OPEN);
		arc1.setFill(Color.ALICEBLUE);
		arc1.setStroke(Color.BLACK);
		line16.setStrokeWidth(6);
		line24.setStrokeWidth(6);
		line25.setStrokeWidth(6);

		// Add items to scene
		getChildren().addAll(arc1, circle1, line11, con1, cLine1, line12, line13, line14, line15, line16, circle2,
				line21, line22, line23, line24, line25);
	}

	// Create some variables for movements
	private double increment = 5;
	private double arcInc = 18.5;
	private double incOpa = 0.1;
	private boolean check1 = false;
	private double cons1 = 525;
	private double cons2 = 75;

	public void move1Control() { // Conductor checker
		if (conT) {
			conT21 = true;
		}
		if (conT21) {
			move1();
		}
	}

	public void move2Control() { // Conductor checker
		if (conT == false) {
			conT22 = true;
		}
		if (conT22) {
			move2();
		}
	}

	public void move1() { // Move a group of shapes

		// Set values for movement
		setCons1(cons1 - increment);

		if (cons1 >= 260) {
			if (line14.getStartY() <= 125)
				line14.setStartY(line14.getStartY() + increment);
			if (line14.getEndY() >= 35)
				line14.setEndY(line14.getEndY() - increment);
			if (line15.getEndX() >= 265)
				line15.setEndX(line15.getEndX() - increment);
			if (arc1.getCenterX() >= 245)
				arc1.setCenterX(arc1.getCenterX() - increment);
			if (arc1.getCenterX() <= 285)
				if (arc1.getLength() >= 0)
					arc1.setLength(arc1.getLength() - arcInc);
			if (line16.getStartX() >= 265)
				line16.setStartX(line16.getStartX() - increment);
			if (line16.getEndX() >= 265)
				line16.setEndX(line16.getEndX() - increment);
		}

		//Control second part of movement
		if (cons1 <= 260) {
			line14.setStartY(line14.getStartY() - increment);
			line14.setEndY(line14.getEndY() + increment);
			line11.setOpacity(line11.getOpacity() - incOpa);
			line12.setOpacity(line12.getOpacity() - incOpa);
			line13.setOpacity(line13.getOpacity() - incOpa);
			line14.setOpacity(line14.getOpacity() - incOpa);
			line15.setOpacity(line15.getOpacity() - incOpa);
			line16.setOpacity(line16.getOpacity() - incOpa);
			arc1.setOpacity(arc1.getOpacity() - incOpa);
			circle1.setRadius(circle1.getRadius() - 1);
			getChildren().removeAll(line15, line16, arc1);
		}

		//Check collision situations
		if (arc1.getCenterX() == 460)
			if (line25.getEndY() == 75)
				restart();
			else
				check1 = true;

	}

	public void move2() { //Move a group of shapes

		//Move a group of shapes
		setCons2(cons2 + increment);

		if (cons2 <= 290) {
			if (line24.getStartX() >= 435)
				line24.setStartX(line24.getStartX() - increment);
			if (line24.getEndX() <= 525)
				line24.setEndX(line24.getEndX() + increment);
			if (line25.getEndY() <= 285)
				line25.setEndY(line25.getEndY() + increment);
		}

		//Control second part of movement
		if (cons2 >= 290) {
			line21.setOpacity(line21.getOpacity() - incOpa);
			line22.setOpacity(line22.getOpacity() - incOpa);
			line23.setOpacity(line23.getOpacity() - incOpa);
			line24.setStartX(line24.getStartX() + increment);
			line24.setEndX(line24.getEndX() - increment);
			line24.setOpacity(line24.getOpacity() - incOpa);
			line25.setOpacity(line25.getOpacity() - incOpa);
			circle2.setRadius(circle2.getRadius() - 1);
			getChildren().removeAll(line25);
		}

		//If there is no collision start next level
		if (check1)
			if (cons1 <= 200)
				nextLevel();

	}

	public void moveCon() { //Conductor movement

		if (conT) {
			getChildren().remove(cLine1);
			getChildren().add(cLine2);
			conT = false;
		} else {
			getChildren().remove(cLine2);
			getChildren().add(cLine1);
			conT = true;
		}
	}

	//These four methods set values for movements
	public void setCons1(double Cons1) {
		cons1 = Cons1;
	}

	public void setCons2(double Cons2) {
		cons2 = Cons2;
	}

	public void nextLevel() { //Start next level
		getChildren().clear();
		getChildren().add(con1);
		if (conT)
			getChildren().add(cLine1);
		else
			getChildren().add(cLine2);
		con1.setOpacity(con1.getOpacity() - incOpa * 0.7);
		cLine1.setOpacity(cLine1.getOpacity() - incOpa * 0.7);
		cLine2.setOpacity(cLine2.getOpacity() - incOpa * 0.7);
		getChildren().add(next);
	}

	public void restart() {	//Restart the same level

		getChildren().clear();
		increment = 0;
		getChildren().addAll(arc1, circle1, line11, con1, cLine1, line12, line13, line14, line15, line16, circle2,
				line21, line22, line23, line24, line25);

		con1.setOpacity(con1.getOpacity() - incOpa * 0.4);
		cLine1.setOpacity(cLine1.getOpacity() - incOpa * 0.4);
		cLine2.setOpacity(cLine2.getOpacity() - incOpa * 0.4);

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
		circle2.setOpacity(circle2.getOpacity() - incOpa * 0.4);

		if (circle1.getOpacity() - incOpa * 0.4 <= 0) {
			getChildren().clear();
			getChildren().add(rest);

		}
	}
}