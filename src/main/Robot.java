package main;

import keyListner.KeyListner;
import robotBase.Command;
import robotBase.RobotBase;
import robotBase.RobotState;
/**
 * Major changes
 * @author YuYue
 * @version 1.0
 * 2020¦~7¤ë11¤é
 */
public class Robot extends RobotBase{
	RobotContainer container = new RobotContainer();
	@Override
	public void RobotInit() {
		new Thread() {
			KeyListner listner = new KeyListner();
		}.start();
		
	}
	@Override
	public void autonomousInit() {
		// TODO Auto-generated method stub
		RobotState.isInit = true;
	}

	@Override
	public void autonomousPeriodic() {
		System.out.println("auto");
		
	}

	@Override
	public void teleopInit() {
		System.out.println("teleopInit");
		RobotState.isInit = true;
		
	}

	@Override
	public void teleopPeriodic() {
		Command command = container.map.get(RobotState.getPressedChar());
		if(command != null) {
			command.start();
		}
		
	}

}
