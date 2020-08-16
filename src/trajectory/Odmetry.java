package trajectory;
/**
 * Recording robot's position.
 * @author YuYue
 * @version 1.0
 * 2020¦~7¤ë11¤é
 */
public class Odmetry {
	private static double x = 0;
	private static double y = 0;
	private static Rotation rotation = new Rotation(0);
	/**
	 * Update position by Polar coordinate
	 * @param distance
	 * @param rotation
	 */
	public static void updatePosition(double distance, double rotation) {
		double tempX = Math.round((Math.cos(Math.toRadians(Odmetry.rotation.getChange(rotation))) * 100.0)) / 100.0 * distance;
		double tempY = Math.round((Math.sin(Math.toRadians(Odmetry.rotation.getChange(rotation))) * 100.0)) / 100.0 * distance;
		x += tempX;
		y = getY() + tempY;
	}
	/**
	 * Reset odmetry.
	 */
	public static void reset() {
		x = y = 0;
	}
	/**
	 * Set odmetry
	 * @param x
	 * @param y
	 */
	public static void setPosition(double x, double y) {
		Odmetry.x = x;
		Odmetry.y = y;
	}
	/**
	 * Getter for x.
	 * @return y
	 */
	public static double getX() {
		return x;
	}
	/**
	 * Getter for y.
	 * @return x
	 */
	public static double getY() {
		return y;
	}

}
