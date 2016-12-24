package org.usfirst.frc.team5987.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Victor;

public class ShootingSubsystem {
	static DigitalInput reciever = new DigitalInput(0);
	static Victor spinMotor = new Victor(2);
	static Victor angleMotor = new Victor(3); //todo delet
	static Servo doorControl = new Servo(4);
	
	public static boolean isBall(){
		return reciever.get();
	}
	
	public void shoot(double speed){
		spinMotor.set(speed);
	}
	
	public void setAngle(double angleDifference){
	
		if (angleDifference > 0.5 ){
			angleMotor.set(0.35);
		} else if(angleDifference < -0.5){
			angleMotor.set(-0.35);
		} else{
			angleMotor.set(0);
		}
	}
	
	public static double getAngle(){
	    double angle = 30;
		return angle;
		
	}
	
	public static void doorControl(boolean flag){
		final double servoStartAngle =  doorControl.getAngle();
		
		if (flag == true){
			doorControl.setAngle(servoStartAngle+90);
		}
		else {
			doorControl.setAngle(servoStartAngle-90);	
		}
			
	}
}
