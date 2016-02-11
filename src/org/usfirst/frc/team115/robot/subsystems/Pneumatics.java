package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem{
	private DoubleSolenoid doublesolenoid;
	public Pneumatics (){
		doublesolenoid = new DoubleSolenoid (RobotMap.SOLENOIDA, RobotMap.SOLENOIDB); 
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void puff(){
		doublesolenoid.set(DoubleSolenoid.Value.kForward);
	}
	public void deflate(){
		doublesolenoid.set(DoubleSolenoid.Value.kReverse);	
		
	}

}
