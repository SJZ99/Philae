package messageBase;
/**
 * Output message to console.
 * @author YuYue
 * @version 1.0
 * @see #CrashTracker
 */
public class Printer {
	/**
	 * Print message + "\n"
	 * @param message
	 * @see #print(String)
	 */
	public static void println(String message) {
		System.out.println(message + "\n");
	}
	/**
	 * Print message
	 * @param message
	 * @see #println(String)
	 */
	public static void print(String message) {
		System.out.print(message);
	}
}
