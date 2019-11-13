package Checkpoint;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String z = JOptionPane.showInputDialog("whats your favorite color");
JOptionPane.showMessageDialog(null, z + " is also my favorite color");	
Robot Z = new Robot();
Z.penDown();
Z.setPenColor(Color.red);
Z.setSpeed(100);	
for (int i = 0; i < 3; i++) {
	Z.move(100);	
	Z.turn(120);	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
