package org.usfirst.frc.team115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.Button;

public class OI {
	static Joystick joystick;
	public OI(){
		joystick = new Joystick (RobotMap.JOYSTICK);
	}
	public Joystick getJoystick(){
		return joystick;
	}
	public double getYAxis ()
	{
		return joystick.getAxis(AxisType.kY);
	}
	
	public double getXAxis ()
	{
		return joystick.getAxis(AxisType.kX);
	}
	public static boolean getForwardsButton(){
		return joystick.getRawButton(1);
	}
	public static boolean getPuffButton(){
		return joystick.getRawButton(2);
	}

}