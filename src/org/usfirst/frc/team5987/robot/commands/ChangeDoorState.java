package org.usfirst.frc.team5987.robot.commands;

import org.usfirst.frc.team5987.robot.Robot;
import org.usfirst.frc.team5987.robot.subsystems.ShootingMechanismSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ChangeDoorState extends Command {

    private boolean isOpen;
    
	
    public ChangeDoorState() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shootingMechanismSubsystem);
    	this.isOpen = !ShootingMechanismSubsystem.getDoorLim();
    	
    }

    
    /**
     * 
     * @param isOpen boolean that contains the current state of the door
     *
     */
    public ChangeDoorState(boolean isOpen){
    	
    	requires(Robot.shootingMechanismSubsystem);
    	this.isOpen = isOpen;
    	
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	ShootingMechanismSubsystem.setDoorSpeed(isOpen ? 1 : -1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(isOpen == !ShootingMechanismSubsystem.getDoorLim())
    		return true;
    	else
    		return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	ShootingMechanismSubsystem.setDoorSpeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	cancel();
    }
}
