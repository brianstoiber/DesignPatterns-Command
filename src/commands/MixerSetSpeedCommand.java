package commands;

import request.Mixer;

public class MixerSetSpeedCommand implements Command {
	Mixer mixer;
	int speed;

	public MixerSetSpeedCommand(Mixer mixer, int speed) {
		this.mixer = mixer;
		this.speed = speed;
	}
	
	@Override
	public void execute() {
		mixer.setMixerSpeed(speed);
	}
	
}