package robotBase;
/**
 * Robot frame.
 * @author YuYue
 * @version 1.0
 * 2020¦~7¤ë11¤é
 */
public abstract class RobotBase {
	/**
	 * Will be called when first start robot.
	 */
	public abstract void RobotInit();
	/**
	 * Will be called when first start autonomous.
	 */
	public abstract void autonomousInit();
	/**
	 * Will be called periodic.
	 */
	public abstract void autonomousPeriodic();
	/**
	 * Will be called when first start teleop.
	 */
	public abstract void teleopInit();
	/**
	 * Will be called periodic.
	 */
	public abstract void teleopPeriodic();
	/**
	 * Start Robot. Will be called at main.
	 */
	public final void start() {
		while(true) {
			if(RobotState.mode == Mode.TELEOP) {
				if(RobotState.isInit) {
					teleopInit();
				}
				teleopPeriodic();
			}else if(RobotState.mode == Mode.AUTONOMOUS) {
				if(RobotState.isInit) {
					autonomousInit();
				}
				autonomousPeriodic();
			}
		}
	}
}
