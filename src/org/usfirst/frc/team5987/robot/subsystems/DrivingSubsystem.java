package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;
import org.usfirst.frc.team5987.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Doron && Lana
 * The driving subsystem
 *
 */
public class DrivingSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	static Victor victor1;
	static Victor victor2;
	static Victor victor3;
	static Victor victor4;
	
	/** 
	 * @author Doron
	 * 
	 * use as kind of constructor
	 * Initialize the victors and set the default command 
	 */
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand(0,0));
    	
    	victor1 = new Victor(RobotMap.leftFrontMotor);
    	victor2 = new Victor(RobotMap.rightFrontMotor);
    	victor3 = new Victor(RobotMap.leftRearMotor);
    	victor4 = new Victor(RobotMap.rightRearMotor);
    
    	victor1.setExpiration(0.05);
    	victor1.setExpiration(0.05);
    	victor3.setExpiration(0.05);
    	victor4.setExpiration(0.05);
    	
    	victor3.setInverted(true);
    	victor4.setInverted(true);
    }
	
    /**
	 *@author Doron && Lana  
	 * 
	 * @param speedLeft
	 * @param speedRight
	 * 
	 * this function set the motor speed using Victors
	 */
    public static void drive(double speedLeft,double speedRight)
	{
		
    	victor1.set(speedLeft);
		victor3.set(speedLeft);
		
		victor2.set(speedRight);
		victor4.set(speedRight);
		
		
	}

    
}

