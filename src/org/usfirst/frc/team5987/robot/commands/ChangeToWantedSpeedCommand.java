package org.usfirst.frc.team5987.robot.commands;

import org.usfirst.frc.team5987.robot.Robot;
import org.usfirst.frc.team5987.robot.subsystems.NetworkTablesSubsystem;
import org.usfirst.frc.team5987.robot.subsystems.ShootingMechanismSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ChangeToWantedSpeedCommand extends Command {

	double wantedSpeed;
	double currentSpeed;
	double k_forward ;
	double k_backward ;

	public ChangeToWantedSpeedCommand() {

		requires(Robot.shootingMechanismSubsystem);
		requires(Robot.networkTablesSubsystem);

		wantedSpeed = NetworkTablesSubsystem.getMotorSpeed();
		currentSpeed = ShootingMechanismSubsystem.getShootSpeed();
		
		k_forward = 0.001;
		k_backward = -0.001;
			
	}

	// Called just before this Command runs the first time
	protected void initialize() {

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if(ShootingMechanismSubsystem.getShootSpeedRPM() > NetworkTablesSubsystem.getMotorSpeed() )
			ShootingMechanismSubsystem.setShootSpeed(ShootingMechanismSubsystem.getShootSpeed() + this.k_backward);
		else 
			ShootingMechanismSubsystem.setShootSpeed(ShootingMechanismSubsystem.getShootSpeed() + this.k_forward);

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		
		if(Math.abs(wantedSpeed-currentSpeed) < 0.1 )
    		return true;
    		else
    			return false;
    		}

	

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
