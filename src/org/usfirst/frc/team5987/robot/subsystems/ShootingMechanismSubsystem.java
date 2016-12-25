
package org.usfirst.frc.team5987.robot.subsystems;

import org.usfirst.frc.team5987.robot.RobotMap;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShootingMechanismSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    static Victor shootMotor = new Victor(RobotMap.shootMotorPort);
	static Victor doorMotor = new Victor(RobotMap.DoorPort);
	static Servo doorServo = new Servo(RobotMap.ServoDoor);
	static Encoder shootEncoder = new Encoder(RobotMap.shootEncoderPortA,RobotMap.shootEncoderPortB,true,EncodingType.k4X);
	static DigitalInput reciever = new DigitalInput(RobotMap.ballReciver);

	public static boolean isBall(){
		return reciever.get();
	}
	
	public void shoot(double speed){
		shootMotor.set(speed);
	}	
	
	public static void doorControl(boolean flag){
		final double servoStartAngle =  doorServo.getAngle();
		
		if (flag == true){
			doorServo.setAngle(servoStartAngle+90);
		}
		else {
			doorServo.setAngle(servoStartAngle-90);	
		}
			
	}
}



