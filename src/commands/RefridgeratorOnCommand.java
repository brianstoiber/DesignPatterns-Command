package commands;

import request.Refridgerator;

public class RefridgeratorOnCommand implements Command {
	Refridgerator fridge;

	public RefridgeratorOnCommand(Refridgerator fridge) {
		this.fridge = fridge;
	}
	
	@Override
	public void execute() {
		fridge.on();
	}
	
}