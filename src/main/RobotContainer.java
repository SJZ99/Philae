package main;

import java.util.HashMap;
import java.util.Map;

import robotBase.Command;

public class RobotContainer {
	/** Command container */
	public Map<Character, Command> map = new HashMap<Character, Command>();
	
	public RobotContainer() {
		//Add your command here
	}
}
