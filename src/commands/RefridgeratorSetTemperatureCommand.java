package commands;

import request.Refridgerator;

public class RefridgeratorSetTemperatureCommand implements Command {
	Refridgerator fridge;
	int temperature;

	public RefridgeratorSetTemperatureCommand(Refridgerator fridge, int temperature) {
		this.fridge = fridge;
		this.temperature = temperature;
	}
	
	@Override
	public void execute() {
		fridge.setTemperature(temperature);
	}
	
}