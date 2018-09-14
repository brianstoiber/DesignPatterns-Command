package commands;

import request.Blender;

public class BlenderOffCommand implements Command {
	Blender blender;

	public BlenderOffCommand(Blender blender) {
		this.blender = blender;
	}
	
	@Override
	public void execute() {
		blender.off();
	}

}