package commands;

import request.BreadSlicer;

public class BreadSlicerSliceCommand implements Command {
	BreadSlicer slicer;

	public BreadSlicerSliceCommand(BreadSlicer slicer) {
		this.slicer = slicer;
	}
	
	@Override
	public void execute() {
		slicer.slice();
	}
	
}