package commands;

import request.Blender;

public class BlenderOnCommand implements Command {
	Blender blender;

	public BlenderOnCommand(Blender blender) {
		this.blender = blender;
	}
	
	@Override
	public void execute() {
		blender.on();
	}
	
}