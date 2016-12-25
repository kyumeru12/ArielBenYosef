package org.usfirst.frc.team5987.robot.commands;

import org.usfirst.frc.team5987.robot.Robot;
import org.usfirst.frc.team5987.robot.subsystems.PickerSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PickShootCommand extends Command {

    public PickShootCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.pickerSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	PickerSubsystem.rotate(1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(PickerSubsystem.getLimitSwitch())
    		return true;
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    
    	PickerSubsystem.rotate(0);
    	//call shooting command
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	PickerSubsystem.rotate(0);
    }
}
