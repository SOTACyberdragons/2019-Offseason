/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//PWM
	//public static final int CLIMBER_MOTOR = 0;

	//CAN
	public static final int RIGHT_DRIVE_MOTOR = 0;
	public static final int LEFT_DRIVE_MOTOR = 4;
	public static final int RIGHT_DRIVE_FOLLOW_MOTOR = 6;
	public static final int LEFT_DRIVE_FOLLOW_MOTOR = 7;



	public static final int RIGHT_ARM_MOTOR = 5;
	public static final int LEFT_ARM_MOTOR = 2;
	public static final int CARGO_MOTOR = 1;
	public static final int FLOOR_HATCH_INTAKE_MOTOR = 38;
	public static final int FLOOR_HATCH_ARM_MOTOR = 9;
	//public static final int CLIMBER_MOTOR1 = 11;
	
	//public static final int CLIMBER_MOTOR2 = 2;
	public static final int LEFT_CLIMBER_MOTOR = 3;
	public static final int RIGHT_CLIMBER_MOTOR = 10;
	public static final int CENTER_CLIMBER_MOTOR = 8;



	//pneumatics
	public static final int HATCH_PISTON_1 = 0;
	public static final int HATCH_PISTON_2 = 1;
	
}