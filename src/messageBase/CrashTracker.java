package messageBase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
/**
 * Write log to file that passed by constructor.
 * @author YuYue
 * @version 1.0
 * @see #Printer 
 * 
 */
public class CrashTracker {
	private File f;
	
	public CrashTracker(String path) {
		f = new File(path);
	}
	
	/**
	 * Write log. Contain Date()
	 * @param event 
	 */
	public void write(String event){
		try {
			BufferedWriter bw 
				= new BufferedWriter(new FileWriter(f, true));
			bw.write(new Date().toString() + "\n");
			bw.write(event + "\n");
			bw.flush();
			bw.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	/**
	 * Write log and "\n"
	 * @param event
	 */
	public void writeln(String event) {
		try {
			BufferedWriter bw 
				= new BufferedWriter(new FileWriter(f, true));
			bw.write(event + "\n");
			bw.flush();
			bw.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Clean log.
	 */
	public void clean() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			bw.write("\0");
			bw.flush();
			bw.close();
		}catch(IOException e) {
			
		}
	}
}
