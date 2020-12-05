package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
		public static void main(String[] args) {	
	//2. create an array of 5 robots.		
		Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < 5; i++) {
			robots[i] = new Robot("batman");
		//4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setX(75*i+50);
			robots[i].setY(250);
			robots[i].setSpeed(10);
		
		}
		for (int j = 0; j < 30; j++) {
		for (int i = 0; i < 5; i++) {
			
			robots[i].move(30);
			robots[i].turn(30);
		}
		}
		}
}