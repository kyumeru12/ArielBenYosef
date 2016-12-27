package org.usfirst.frc.team5987.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5987.robot.Robot;
import org.usfirst.frc.team5987.robot.subsystems.DrivingSubsystem;

/**
 *
 */
public class DriveCommand extends Command {

    private double left;
	private double right;

  
    public DriveCommand(double left,double right )
   {
	   requires(Robot.drivingSubsytem);
	   this.left = left;
	   this.right =right;
   }
  

    // Called just before this Command runs the first time
    protected void initialize() {
    	DrivingSubsystem.drive(left,right);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
