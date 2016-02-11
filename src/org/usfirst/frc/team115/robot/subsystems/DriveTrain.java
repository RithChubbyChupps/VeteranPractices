package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem{
	private CANTalon turnMotor, driveMotor;
	public DriveTrain(){
		turnMotor = new CANTalon (RobotMap.TURN);
		driveMotor = new CANTalon (RobotMap.DRIVE);
	}
	public void drive(double turn, double drive){
		turnMotor.set(turn);
		driveMotor.set(drive);
	}
	public void stop(){
		turnMotor.set(0);
		driveMotor.set(0);
	}
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
