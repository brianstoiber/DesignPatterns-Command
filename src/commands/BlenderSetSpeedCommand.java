package commands;

import request.Blender;

public class BlenderSetSpeedCommand implements Command {
	Blender blender;
	int speed = 0;

	public BlenderSetSpeedCommand(Blender blender, int speed) {
		this.blender = blender;
		this.speed = speed;
	}
	
	@Override
	public void execute() {
		blender.setBlendSpeed(speed);
	}
	
}