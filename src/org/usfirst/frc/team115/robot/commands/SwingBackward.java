package org.usfirst.frc.team115.robot.commands;

import org.usfirst.frc.team115.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SwingBackward extends Command{
	public SwingBackward(){
		requires(Robot.arms);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Just doing my really swag dance moves.");
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.arms.swingBackward(Robot.oi.getYAxis (),Robot.oi.getXAxis());
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
