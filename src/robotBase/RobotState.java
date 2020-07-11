package robotBase;

import java.awt.event.KeyEvent;

/**
 * Storing Robot state.
 * @author YuYue
 * @version 1.0
 * 2020¦~7¤ë11¤é
 */
public class RobotState {
	/** Teleop or Autonomous */
	public static Mode mode = Mode.TELEOP;
	/** True if need initial */
	public static boolean isInit = true;
	/** Storing which key was pressed */
	public static KeyEvent keyPressed;
	/** Storing which key was released */
	public static KeyEvent keyReleased;
	
	
}
