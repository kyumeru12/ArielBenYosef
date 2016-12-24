package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.OI;
import org.usfirst.frc.team5987.robot.RobotMap;

public class DriveSubsytem {

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
