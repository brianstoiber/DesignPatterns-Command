package commands;

import request.Refridgerator;

public class RefridgeratorOffCommand implements Command {
	Refridgerator fridge;

	public RefridgeratorOffCommand(Refridgerator fridge) {
		this.fridge = fridge;
	}
	
	@Override
	public void execute() {
		fridge.off();
	}
		
}