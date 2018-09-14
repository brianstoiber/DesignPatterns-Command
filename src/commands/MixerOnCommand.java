package commands;

import request.Mixer;

public class MixerOnCommand implements Command {
	Mixer mixer;

	public MixerOnCommand(Mixer mixer) {
		this.mixer = mixer;
	}
	
	@Override
	public void execute() {
		mixer.on();
	}
	
}