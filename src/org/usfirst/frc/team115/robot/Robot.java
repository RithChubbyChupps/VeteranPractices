package org.usfirst.frc.team115.robot;

import org.usfirst.frc.team115.robot.commands.SwingBackward;
import org.usfirst.frc.team115.robot.subsystems.Arms;
import org.usfirst.frc.team115.robot.subsystems.Compression;
import org.usfirst.frc.team115.robot.subsystems.DriveTrain;
import org.usfirst.frc.team115.robot.subsystems.Pneumatics;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot{
		public static DriveTrain drive;
		public static OI oi;
		public static Pneumatics pneumatics;
		public static Compression compression;
		public static Arms arms;
	    public void robotInit() {
	    	oi = new OI();
	    	drive = new DriveTrain();
	    	pneumatics = new Pneumatics();
	    	arms = new Arms();
	    	compression = new Compression();
			
	        // instantiate the command used for the autonomous period
	    }
		
		public void disabledPeriodic() {
			Scheduler.getInstance().run();
		}

	    public void autonomousInit() {
	    }

	    /**
	     * This function is called periodically during autonomous
	     */
	    public void autonomousPeriodic() {
	        Scheduler.getInstance().run();
	    }

	    public void teleopInit() {
	    	System.out.println("Hello, I am Baymax your personal healthcare assistant.");
	    }

	    /**
	     * This function is called when the disabled button is hit.
	     * You can use it to reset subsystems before shutting down.
	     */
	    public void disabledInit(){

	    }

	    /**
	     * This function is called periodically during operator control
	     */
	    public void teleopPeriodic() {
	        Scheduler.getInstance().run();
	        SmartDashboard.putBoolean("Left Limit Switch: ", Arms.detectLeftLimit());
	        SmartDashboard.putBoolean("Right Limit Switch: ", Arms.detectRightLimit());
	        SmartDashboard.putBoolean("Swinging Forward: ", Arms.swingForward());
	        SmartDashboard.putData("Swing Backwards ", new SwingBackward());
	    }
	    
	    /**	
	     * This function is called periodically during test mode
	     */
	    public void testPeriodic() {
	        LiveWindow.run();
	    }
	}



