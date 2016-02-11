package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Compression extends Subsystem{
	private Compressor compressor;
	public Compression(){
		compressor = new Compressor (RobotMap.COMPRESSOR);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void compress(){
		compressor.setClosedLoopControl(true);
	}
	public void uncompress(){
		compressor.setClosedLoopControl(false);
	}

}
