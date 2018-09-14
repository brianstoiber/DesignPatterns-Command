package commands;

import request.Oven;

public class OvenOnCommand implements Command {
	Oven oven;

	public OvenOnCommand(Oven oven) {
		this.oven = oven;
	}
	
	@Override
	public void execute() {
		oven.on();
	}
	
}