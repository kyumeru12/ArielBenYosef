package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.OI;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DrivingSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	
    public void drive(double speedLeft)
	{
		OI.victor1.set(speedLeft);
		OI.victor3.set(speedLeft);
		
		OI.victor2.set(OI.right.getY());
		OI.victor4.set(OI.right.getY());
	}

    public double getRotation(){
		return 1;
	}

}

   
