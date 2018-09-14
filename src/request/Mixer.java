package request;

public class Mixer {
	private int mixerSpeed = 1; // default value is 1. should be set from 1-5
	
	public void on() {
		System.out.println("Mixer is on");
	}
	
	public void off() {
		System.out.println("Miser is off");
	}

	// sets mixer speed
	public void setMixerSpeed(int mixerSpeed) {
		System.out.println("Previous mixer speed: " + this.mixerSpeed);
		this.mixerSpeed = mixerSpeed;
		System.out.println("Current mixer speed: " + this.mixerSpeed);
	}
	
}	