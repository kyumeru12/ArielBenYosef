package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;
import org.usfirst.frc.team5987.robot.commands.ExampleCommand;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *@author Bohadna
 *	THe Collection of ball subsystem
 */

public class PickerSubsystem extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	static Victor leftSide;
	static Victor rightSide;
	public static DigitalInput limitswitch;
	public static double speed;
	
	/**
	 * @author Bohadana
	 * use as kind of constructor
	 * Initialize the victors and set the default command 
	 */
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new ExampleCommand()); //TODO change to a real command
		leftSide = new Victor(RobotMap.leftPickerPort);
		rightSide = new Victor(RobotMap.rightPickerPort);
		leftSide.setExpiration(0.05);
		rightSide.setExpiration(0.05);
		
		limitswitch = new DigitalInput(RobotMap.pikerLimSwitch);
		
		rightSide.setInverted(true);
	}

	/**
	 * this function set the speed for the subsystem's motors
	 * 
	 * @param speed which is the speed that will be set for the motors
	 */
	public static void rotate(double speed) {
		leftSide.set(speed);
		rightSide.set(speed);
	}
	
	/**
	 * this function responsible for the limit switch data
	 * @return true if the limit switch is pressed else false
	 */
	public static boolean getLimitSwitch()
	{
		return limitswitch.get();
	}
}