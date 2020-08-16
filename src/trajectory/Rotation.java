package trajectory;
/**
 * Rotation
 * @author YuYue
 * @version 1.0
 * 2020¦~7¤ë11¤é
 */
public class Rotation {
	private double lastRotationDegree;
	private double rotationChange;
	/**
	 * Constructor
	 * @param rotation
	 */
	public Rotation(double rotation) {
		lastRotationDegree = rotation;
	}
	/**
	 * Get change
	 * @param rotation
	 * @return 
	 */
	public double getChange(double rotation) {
		rotationChange = lastRotationDegree - rotation;
		lastRotationDegree = rotation;
		return rotationChange;
	}
}
