package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arms extends Subsystem{
	private static CANTalon rightMotor;
	private static CANTalon leftMotor;
	private static DigitalInput limitSwitcha;
	private static DigitalInput limitSwitchb;
	public Arms(){
		rightMotor = new CANTalon (RobotMap.RIGHT);
		leftMotor = new CANTalon (RobotMap.LEFT);
		limitSwitcha = new DigitalInput (RobotMap.SWITCHA);
		limitSwitchb = new DigitalInput (RobotMap.SWITCHB);
	}
	public static boolean swingForward(){
		rightMotor.set(0.5);
		leftMotor.set(-0.5);
		return true;
	}
	public void swingBackward(){
		rightMotor.set(-0.5);
		leftMotor.set(0.5);
	}
	public void stop(){
		rightMotor.set(0);
		leftMotor.set(0);
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
