package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arms extends Subsystem{
	private CANTalon[] motors = new CANTalon[2];
	private RobotDrive drive;
	private int LEFT = 1;
	private int RIGHT = 2;
	private CANTalon backLeft;
	private CANTalon backRight;
	private static DigitalInput limitSwitcha;
	private static DigitalInput limitSwitchb;
	
	public Arms(){
		motors[LEFT] = new CANTalon (RobotMap.LEFT);
		motors[RIGHT] = new CANTalon (RobotMap.RIGHT);
		limitSwitcha = new DigitalInput (RobotMap.SWITCHA);
		limitSwitchb = new DigitalInput (RobotMap.SWITCHB);
		backLeft = new CANTalon (RobotMap.DRIVEC);
		backRight = new CANTalon (RobotMap.DRIVED);
		
		backLeft.changeControlMode(CANTalon.TalonControlMode.Follower);
		backLeft.set(LEFT);
		backRight.changeControlMode(CANTalon.TalonControlMode.Follower);
		backRight.set(RIGHT);
		drive = new RobotDrive(motors[LEFT], motors[RIGHT]);
	}
	public boolean swingForward(double rightMotor, double leftMotor){
		drive.arcadeDrive(rightMotor, leftMotor);
		return true;
	}
	public void swingForward (Joystick joystick){
		drive.arcadeDrive(joystick);
	}
	public void swingBackward(double rightMotor, double leftMotor){
		drive.arcadeDrive(rightMotor, leftMotor);
	}
	public void swingBackward (Joystick joystick){
		drive.arcadeDrive(joystick);
	}
	public void stop(){
		swingForward(0,0);
		swingBackward(0,0);
	}
	public static boolean detectLeftLimit(){
		return limitSwitcha.get();
	}
	public static boolean detectRightLimit(){
		return limitSwitchb.get();
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
