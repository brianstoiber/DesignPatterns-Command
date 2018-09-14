package commands;

import request.Mixer;

public class MixerOffCommand implements Command {
	Mixer mixer;

	public MixerOffCommand(Mixer mixer) {
		this.mixer = mixer;
	}
	
	@Override
	public void execute() {
		mixer.off();
	}
	
}