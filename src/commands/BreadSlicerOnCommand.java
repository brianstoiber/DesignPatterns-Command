package commands;

import request.BreadSlicer;

public class BreadSlicerOnCommand implements Command {
	BreadSlicer slicer;

	public BreadSlicerOnCommand(BreadSlicer slicer) {
		this.slicer = slicer;
	}
	
	@Override
	public void execute() {
		slicer.on();
	}
	
}