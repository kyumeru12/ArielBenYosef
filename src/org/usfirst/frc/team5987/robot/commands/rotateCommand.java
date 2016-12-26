
package org.usfirst.frc.team5987.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5987.robot.Robot;
import org.usfirst.frc.team5987.robot.subsystems.DrivingSubsystem;
import org.usfirst.frc.team5987.robot.subsystems.NetworkTablesSubsystem;

/**
 *
 */
public class rotateCommand extends Command {

    public rotateCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivingSubsytem);
        requires(Robot.networkTablesSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	DrivingSubsystem.drive(NetworkTablesSubsystem.getDistance()/360, -NetworkTablesSubsystem.getDistance()/360);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (Math.abs(NetworkTablesSubsystem.getDistance()) < 70)
    		return true;
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	DrivingSubsystem.drive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
