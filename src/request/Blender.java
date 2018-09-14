package request;

public class Blender {
	
	private int blendSpeed = 1; // should be set from 1-5

	public void on() {
		System.out.println("Blender is on");
	}
	
	public void off() {
		System.out.println("Blender is off");
	}

	// sets blending speed
	public void setBlendSpeed(int blendSpeed) {
		System.out.println("Previous belnder speed" + this.blendSpeed);
		this.blendSpeed = blendSpeed;
		System.out.println("Current blender speed: " + this.blendSpeed);
	}
	
}