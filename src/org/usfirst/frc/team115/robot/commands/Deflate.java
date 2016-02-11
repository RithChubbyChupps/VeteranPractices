package org.usfirst.frc.team115.robot.commands;

import org.usfirst.frc.team115.robot.OI;
import org.usfirst.frc.team115.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Deflate extends Command{

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires (Robot.pneumatics);
		requires (Robot.compression);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if (OI.getPuffButton()){
			Robot.pneumatics.deflate();
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}

