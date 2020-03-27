/*AHMET HAMZA DEMÝR - 150116025
 *ARDA BAYRAM - 150116029
 *
 *In this class we created Level 1.
 */

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Pane1 extends Pane { //Design Level 1

	//Create some variables
	private double y4Upper = 90;
	private double y4Lower = 110;
	private double arcX = 335;
	private double startX6 = 355;
	private double endX6 = 425;
	private double arcLength = 180;
	private double radius1 = 20;
	private double y4Upper2 = 50;
	private double y4Lower2 = 150;
	private double dnm = 425;
	private double opa = 1;
	private double y7 = 95;
	private double startX8 = 325;
	private double endX8 = 345;
	private double radius2 = 20;
	private double startX82 = 285;
	private double endX82 = 385;
	private double opa2 = 1;

	//Create shapes
	Circle circle1 = new Circle(445, 300, 20, Color.BLACK);
	Line line1 = new Line(425, 300, 100, 300);
	Line line2 = new Line(100, 100, 100, 300);
	Line line3 = new Line(100, 100, 125, 100);
	Line line4 = new Line(125, 90, 125, 110);
	Line line5 = new Line(125, 100, 315, 100);
	Arc arc = new Arc(335, 100, 20, 20, 0, 180);
	Line line6 = new Line(355, 100, 425, 100);
	Line line7 = new Line(335, 95, 335, 250);
	Line line8 = new Line(325, 250, 345, 250);
	Circle circle2 = new Circle(335, 360, 20, Color.BLACK);
	Line line9 = new Line(335, 250, 335, 360);

	//Create buttons
	Button rest = new Button("Try Again");
	Button next = new Button("Next Level");

	public Pane1() {

		//Set properties of shapes
		line4.setStrokeWidth(6);
		line5.setStrokeWidth(6);
		arc.setStrokeWidth(6);
		arc.setType(ArcType.OPEN);
		arc.setFill(Color.ALICEBLUE);
		arc.setStroke(Color.BLACK);
		line6.setStrokeWidth(6);
		line7.setStrokeWidth(6);
		line8.setStrokeWidth(6);

		//Add items to scene
		getChildren().addAll(line4, line5, arc, line6, line1, line2, circle1, line3, line7, line8, line9, circle2);

	}

	//Create some variables for movements
	private double increment = 5;
	private double arcInc = 21.5;
	private double incOpa = 0.1;
	private boolean check = true;

	//Move a group of shapes
	public void move1() {

		//Set values for movement
		if (line5.getEndX() >= 130)
			line5.setEndX(line5.getEndX() - increment);
		line4Lmove(y4Lower + increment);
		line4Umove(y4Upper - increment);
		arcMove(arcX - increment);
		line6Smove(startX6 - increment);
		line6Emove(endX6 - increment);
		arcLengthMove(arcLength - arcInc);
		setDnm(dnm - increment);

		//Check collision situation
		if (arcX == 315) {
			if (y7 == 95) {
				check = false;
				restart();
			}
		}

		//Control second part of movement
		if (dnm <= 125) {
			changeOpacity(opa - incOpa);
			shrinkCircle(radius1 - 1);
			endLine4upper(y4Upper2 + increment);
			endLine4lower(y4Lower2 - increment);
		}

		//If there is no collision start next level
		if (check)
			if (dnm == 0)
				nextLevel();

	}

	//Move a group of shapes
	public void move2() {

		//Set values for movement
		line7Move(y7 + increment);
		line8Smove(startX8 - increment);
		line8Emove(endX8 + increment);

		//Control second part of movement
		if (y7 >= 250) {
			changeOpacity2(opa2 - incOpa);
			shrinkCircle2(radius2 - 1);
			endLine8start(startX82 + increment);
			endLine8end(endX82 - increment);
		}
	}

	//All methods set values for movements
	public void line7Move(double y7) {
		this.y7 = y7;
		setValues();
	}

	public void line8Smove(double sX8) {
		startX8 = sX8;
		setValues();
	}

	public void line8Emove(double eX8) {
		endX8 = eX8;
		setValues();
	}

	public void endLine8start(double sX8) {
		startX82 = sX8;
		setValues();
	}

	public void endLine8end(double eX8) {
		endX82 = eX8;
		setValues();
	}

	public void changeOpacity2(double opa2) {
		this.opa2 = opa2;
		setValues();
	}

	public void setDnm(double Dnm) {
		dnm = Dnm;
		setValues();
	}

	public void line4Lmove(double y4l) {
		y4Lower = y4l;
		setValues();
	}

	public void line4Umove(double y4u) {
		y4Upper = y4u;
		setValues();
	}

	public void arcMove(double aX) {
		arcX = aX;
		setValues();
	}

	public void line6Smove(double l6s) {
		startX6 = l6s;
		setValues();
	}

	public void line6Emove(double l6e) {
		endX6 = l6e;
		setValues();
	}

	public void arcLengthMove(double arcL) {
		if (arcX <= 145) {
			arcLength = arcL;
			setValues();
		}
	}

	public void endLine4upper(double y4u) {
		y4Upper2 = y4u;
		setValues();
	}

	public void endLine4lower(double y4l) {
		y4Lower2 = y4l;
		setValues();
	}

	public void changeOpacity(double opa) {
		this.opa = opa;
		setValues();
	}

	public void shrinkCircle(double rad) {
		radius1 = rad;
		setValues();
	}

	public void shrinkCircle2(double rad) {
		radius2 = rad;
		setValues();
	}

	public void setValues() { //Check values and when the correct time has come remove shapes

		if (y4Lower <= 150)
			line4.setEndY(y4Lower);

		if (y4Upper >= 50)
			line4.setStartY(y4Upper);

		if (arcX >= 105) {
			arc.setCenterX(arcX);
			if (arcX <= 145)
				if (arcLength >= 0)
					arc.setLength(arcLength);
		}

		if (startX6 >= 125)
			line6.setStartX(startX6);

		if (endX6 >= 125) {
			line6.setEndX(endX6);

		}
		if (dnm <= 125) {
			if (radius1 >= 0)
				circle1.setRadius(radius1);
			if (y4Upper2 <= 100)
				line4.setStartY(y4Upper2);
			if (y4Lower2 >= 100)
				line4.setEndY(y4Lower2);
			line4.setOpacity(opa);
			line1.setOpacity(opa);
			line2.setOpacity(opa);
			line3.setOpacity(opa);
			getChildren().removeAll(line6, line5, arc);
		}

		if (y7 <= 250)
			line7.setStartY(y7);

		if (startX8 >= 285)
			line8.setStartX(startX8);

		if (endX8 <= 385)
			line8.setEndX(endX8);

		if (y7 >= 250) {

			if (radius2 >= 0)
				circle2.setRadius(radius2);
			if (startX82 <= 335)
				line8.setStartX(startX82);
			if (endX82 >= 335)
				line8.setEndX(endX82);

			line8.setOpacity(opa2);
			line9.setOpacity(opa2);

			getChildren().removeAll(line7);
		}
	}

	public void nextLevel() { //Start next level
		getChildren().clear();
		getChildren().add(next);
	}

	public void restart() {	//Restart the same level

		getChildren().clear();
		increment = 0;
		getChildren().addAll(line4, line5, arc, line6, line1, line2, circle1, line3, line7, line8, line9, circle2);

		line1.setOpacity(line1.getOpacity() - incOpa * 0.4);
		line2.setOpacity(line2.getOpacity() - incOpa * 0.4);
		line3.setOpacity(line3.getOpacity() - incOpa * 0.4);
		line4.setOpacity(line4.getOpacity() - incOpa * 0.4);
		line5.setOpacity(line5.getOpacity() - incOpa * 0.4);
		arc.setOpacity(arc.getOpacity() - incOpa * 0.4);
		line6.setOpacity(line6.getOpacity() - incOpa * 0.4);
		line7.setOpacity(line7.getOpacity() - incOpa * 0.4);
		line8.setOpacity(line8.getOpacity() - incOpa * 0.4);
		line9.setOpacity(line9.getOpacity() - incOpa * 0.4);
		circle1.setOpacity(line9.getOpacity() - incOpa * 0.4);
		circle2.setOpacity(line9.getOpacity() - incOpa * 0.4);

		if (line4.getOpacity() - incOpa * 0.4 <= 0) {
			getChildren().clear();
			getChildren().add(rest);
		}

	}

}
