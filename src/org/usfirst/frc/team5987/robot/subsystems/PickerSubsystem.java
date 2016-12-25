package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;
import org.usfirst.frc.team5987.robot.commands.ExampleCommand;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PickerSubsystem extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	static Victor leftSide;
	static Victor rightSide;
	public static DigitalInput limitswitch;
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new ExampleCommand());
		leftSide = new Victor(RobotMap.leftPickerPort);
		rightSide = new Victor(RobotMap.rightPickerPort);
		leftSide.setExpiration(0.05);
		rightSide.setExpiration(0.05);
		
		limitswitch = new DigitalInput(RobotMap.pikerLimSwitch);
		
		rightSide.setInverted(true);
	}

	public static void rotate(double speed) {
		leftSide.set(speed);
		rightSide.set(speed);
	}
	public static boolean getLimitSwitch()
	{
		if(limitswitch.get())
			return true;
		else
			return false;
	}
}