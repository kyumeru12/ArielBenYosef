package org.usfirst.frc.team5987.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 *
 */
public class NetworkTablesSubsystem extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	static NetworkTable networkTable;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());

		networkTable = NetworkTable.getTable("dataTable");

	}

	public static double getDistance() {
		return networkTable.getNumber("XDiffrence", 0);
	}

	public static double getMotorSpeed() {
		return networkTable.getNumber("motorSpeed", 0);
	}
}
