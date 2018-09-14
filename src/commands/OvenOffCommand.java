package commands;

import request.Oven;

public class OvenOffCommand implements Command {
	Oven oven;

	public OvenOffCommand(Oven oven) {
		this.oven = oven;
	}
	
	@Override
	public void execute() {
		oven.off();
	}
	
}