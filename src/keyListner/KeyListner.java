package keyListner;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import robotBase.Mode;
import robotBase.RobotState;
/**
 * Listening key event.
 * @author YuYue
 * @version 1.0
 * 2020¦~7¤ë11¤és
 */
public class KeyListner extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public KeyListner() {
		KeyAdapter adapter = new KeyAdapter() {
					
					@Override
					public void keyReleased(KeyEvent e) {
						char ch = e.getKeyChar();
						RobotState.keyReleased = ch;
					}
	
					@Override
					public void keyPressed(KeyEvent e) {
						char ch = e.getKeyChar();
						
						changeMode(ch);
						
						RobotState.keyPressed = ch;
					}
			};
			
		this.setBounds(200, 200, 200, 200);
		this.setVisible(true);
		this.toFront();
		this.requestFocus();
		this.setAlwaysOnTop(true);
		
		if(this.isFocused()) {
			this.addKeyListener(adapter);
		}else {
			this.removeKeyListener(adapter);
		}
	}
	
	private static final void changeMode(char ch) {
		if(ch == 'T' || ch == 't') {
			RobotState.mode = Mode.TELEOP;
			RobotState.isInit = false;
		}
			
		
		if(ch == 'G' || ch == 'g') {
			RobotState.mode = Mode.AUTONOMOUS;
			RobotState.isInit = false;
		}
	}
}
