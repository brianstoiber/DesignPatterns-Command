package commands;

import request.Oven;

public class OvenSetTemperatureCommand implements Command {
	Oven oven;
	int temperature;

	public OvenSetTemperatureCommand(Oven oven, int temperature) {
		this.oven = oven;
		this.temperature = temperature;
	}
	
	@Override
	public void execute() {
		oven.setTemperature(temperature);
	}
	
}