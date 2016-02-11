package org.usfirst.frc.team115.robot.commands;

import org.usfirst.frc.team115.robot.OI;
import org.usfirst.frc.team115.robot.Robot;
import org.usfirst.frc.team115.robot.subsystems.Arms;

import edu.wpi.first.wpilibj.command.Command;

public class SwingForward extends Command{
	public SwingForward(){
		requires(Robot.arms);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if (OI.getForwardsButton()){
			Robot.arms.swingForward(Robot.oi.getYAxis (),Robot.oi.getXAxis());
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
		Robot.arms.stop();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
