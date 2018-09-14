package commands;

import request.BreadSlicer;

public class BreadSlicerOffCommand implements Command {
	BreadSlicer slicer;

	public BreadSlicerOffCommand(BreadSlicer slicer) {
		this.slicer = slicer;
	}
	
	@Override
	public void execute() {
		slicer.off();
	}
	
}