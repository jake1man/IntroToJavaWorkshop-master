package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

	
		Robot cheto=new Robot();
		cheto.setSpeed(5);
		cheto.penDown();
		cheto.setPenColor(Color.red);
		cheto.move(130); 
		cheto.turn(75);
		cheto.move(100);
		cheto.turn(50);
		cheto.penDown();
		cheto.setPenColor(Color.blue);
		cheto.move(100);
		cheto.penDown();
		cheto.sparkle();
		cheto.miniaturize();
		cheto.hide();
		cheto.setRandomPenColor();
		cheto.expand();
		cheto.setSpeed(55);
		
		
		
	}
}
