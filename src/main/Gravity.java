/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;
// uncomment the above line to use input in your program.

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		double g= 9.8;
		Scanner myTime = new Scanner(System.in);
		double time= myTime.nextDouble();
		double speed;
		double distance;
		speed=g*time;
		distance=0.5*g*time*time;
		System.out.print("The speed of the object at "+ time);
		System.out.print("seconds after its release is " + speed);
		System.out.print("and the distance the object has travelled in the "+ time );
		System.out.print("seconds after the relase is"+ distance);
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
