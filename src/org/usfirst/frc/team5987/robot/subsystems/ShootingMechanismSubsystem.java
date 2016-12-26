
package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *@author Sendrovich && Dor
 *
 */
public class ShootingMechanismSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	/**
	 * @
	 */
	static CANTalon shootMotor; 
	static Victor doorMotor; 
	static DigitalInput reciever ;
	static DigitalInput doorControl;
	
	
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    
	shootMotor = new CANTalon(RobotMap.shootMotorPort);
	doorMotor  = new Victor(RobotMap.DoorPort);
	reciever   = new DigitalInput(RobotMap.DoorPort);
	doorControl= new DigitalInput(RobotMap.doorLimitSwitch);
	
	}
    
    
	public static boolean isBall(){
		return reciever.get();
	}
	
	
	
	public static boolean getDoorLim()
	{
		return doorControl.get(); 
	}
	
	
	public static void setShootSpeed(double speed)
	{
		shootMotor.set(speed);
	}
	
	public static double getShootSpeedRPM()
	{
		return  shootMotor.getEncVelocity(); //mei-be need to divide by 60 2 change 2 rps
	}
	
	public static double getShootSpeed()
	{
		return shootMotor.getSpeed();
	}
	
	public static void setDoorSpeed(double speed)
	{
		doorMotor.set(speed);
	}
	
	
	

}



