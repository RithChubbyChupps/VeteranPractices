package org.usfirst.frc.team115.robot.commands;

import org.usfirst.frc.team115.robot.Robot;
import org.usfirst.frc.team115.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command{
	public Drive(){
		requires(Robot.drive);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.drive.drive(Robot.oi.getYAxis (),Robot.oi.getXAxis());
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.drive.stop();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
