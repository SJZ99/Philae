package hardware;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.RaspiPin;

public class Encoder {
	private GpioController controller;
	private GpioPinDigitalInput input;
	private boolean status;
	private long count;
	private double distancePerPulse = 1;
	
	public Encoder(int input) {
		controller = GpioFactory.getInstance();
		this.input = controller.provisionDigitalInputPin(RaspiPin.getPinByAddress(input));
	}
	public Encoder(int input, double distancePerPulse) {
		this.distancePerPulse = distancePerPulse;
		controller = GpioFactory.getInstance();
		this.input = controller.provisionDigitalInputPin(RaspiPin.getPinByAddress(input));
	}
	public void update() {
		if(status != input.isHigh()) {
			status = input.isHigh();
			count++;
		}
	}
	public double position() {
		return count * distancePerPulse;
	}
	public void setDistancePerPulse(double distancePerPulse) {
		this.distancePerPulse = distancePerPulse;
	}
}
