package hardware;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class Motor {
	private GpioController controller;
	private GpioPinDigitalOutput in1, in2;
	public Motor(int in1, int in2) {
		controller = GpioFactory.getInstance();
		this.in1 = controller.provisionDigitalOutputPin(RaspiPin.getPinByAddress(in1));
		this.in2 = controller.provisionDigitalOutputPin(RaspiPin.getPinByAddress(in2));
		stop();
	}
	public void stop() {
		in1.low();
		in2.low();
	}
	
	public void turn(boolean isInverted) {
		if(isInverted) {
			in2.high();
			in1.low();
		}else {
			in1.high();
			in2.low();
		}
	}
	
//	public static void main(String[] args) {
////		Motor first = new Motor(14,15);
////		while(true) {
////			first.turn(true);
////		}
//		System.out.println(Runtime.getRuntime().availableProcessors());
//	}
}
