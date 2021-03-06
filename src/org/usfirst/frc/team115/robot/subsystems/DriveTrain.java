package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.RobotMap;
import org.usfirst.frc.team115.robot.commands.ArcadeDriveWithJoystick;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem{
	private CANTalon[] motors = new CANTalon[2];
	private RobotDrive drive;
	private final int LEFT = 1;
	private final int RIGHT = 2;
	private CANTalon backLeft;
	private CANTalon backRight;
	
	public DriveTrain(){
		motors[LEFT] = new CANTalon(RobotMap.DRIVEA);
		motors[RIGHT] = new CANTalon(RobotMap.DRIVEB);
		backLeft = new CANTalon (RobotMap.DRIVEC);
		backRight = new CANTalon (RobotMap.DRIVED);
		
		backLeft.changeControlMode(CANTalon.TalonControlMode.Follower);
		backLeft.set(LEFT);
		backRight.changeControlMode(CANTalon.TalonControlMode.Follower);
		backRight.set(RIGHT);
		 		
		 		drive = new RobotDrive(motors[LEFT], motors[RIGHT]);
	}
	public void drive(double move, double rotate){
		drive.arcadeDrive(move,rotate);
	}
	public void drive(Joystick joystick){
		drive.arcadeDrive(joystick);
	}
	public void control (double leftOutput, double rightOutput){
		drive.setLeftRightMotorOutputs(leftOutput, rightOutput);
	}
	public void stop(){
		drive(0,0);
	}
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		this.setDefaultCommand(new ArcadeDriveWithJoystick());
	}

}
