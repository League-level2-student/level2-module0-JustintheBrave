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
		Random ran = new Random();
		for (int j = 0; j < 70; j++) {
		for (int i = 0; i < 5; i++) {
			int rand = ran.nextInt(20) + 10;
			robots[i].move(rand);
			robots[i].turn(rand/3);
			if(robots[i].getY()>350) {
				JOptionPane.showMessageDialog(null, "Robot " + i + "" + " wins");
				System.exit(0);
			}
		}
		}
		
		
		}
}