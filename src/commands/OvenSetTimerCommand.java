package commands;

import request.Oven;

public class OvenSetTimerCommand implements Command {
	Oven oven;
	int timer;

	public OvenSetTimerCommand(Oven oven, int timer) {
		this.oven = oven;
		this.timer = timer;
	}
	
	@Override
	public void execute() {
		oven.setTimer(timer);
	}
	
}