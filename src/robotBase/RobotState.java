package robotBase;

import java.awt.event.KeyEvent;

/**
 * Storing Robot state.
 * @author YuYue
 * @version 1.0
 * 2020�~7��11��
 */
public class RobotState {
	/** Teleop or Autonomous */
	public static  Mode   mode = Mode.TELEOP;
	
	/** True if need initial */
	public static boolean isInit = true;
	
	/** Storing which key was pressed */
	public static char keyPressed = ' ';
	
	/** Storing which key was released */
	public static char keyReleased = ' ';
	
	/** True if left side motor is forward */
	public static boolean  leftForward;
	
	/** True if right side motor is forward */
	public static boolean  rightForward;
	
	/**
	 * If keyPressed is existing, return a character.
	 * @return char
	 */
	public static char getPressedChar() {
		if(keyPressed != ' ') {
			char ch = keyPressed;
			keyPressed = ' ';
			return ch;
		}
		return ' ';
	}
	
	/**
	 * If keyPressed is existing, return a character.
	 * @return char
	 */
	public static char getrReleasedChar() {
		if(keyReleased != ' ') {
			char ch = keyReleased;
			keyReleased = ' ';
			return ch;
		}
		return ' ';
	}
	
}
