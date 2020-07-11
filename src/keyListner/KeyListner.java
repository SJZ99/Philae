package keyListner;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import robotBase.RobotState;
/**
 * Listening key event.
 * @author YuYue
 * @version 1.0
 * 2020�~7��11��s
 */
public class KeyListner extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public KeyListner() {
		this.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				RobotState.keyReleased = e;
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				RobotState.keyPressed = e;
			}
		});
		this.setVisible(false);
	}
}
