package org.usfirst.frc.team5987.robot;
/**
 * The RobotMap is a mapping 5ovides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Driving motors
	public static int leftRearMotor = 0;
    public static int rightRearMotor =1;
    public static int leftFrontMotor = 2;
    public static int rightFrontMotor = 3;
	
    //Driving encoders
    public static int leftDriveEncoder = 3;
    public static int rightDriveEncoder = 3;
    
    //Motor for shootin
  	public static int shootMotorPort = 4;
  	public static int DoorPort = 5;
  	public static int ServoDoor =6;
    
	//Ball pickers motors
	public static int leftPickerPort = 7;
	public static int rightPickerPort = 8;
    
   //Sensor
	public static int shootEncoderPortA = 0;
	public static int shootEncoderPortB = 1;
	public static int pikerLimSwitch = 2;
	public static int ballReciver = 3;
	
	
	
	
}
