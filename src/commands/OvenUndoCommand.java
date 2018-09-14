package commands;

import request.Oven;

public class OvenUndoCommand implements Command {
	Oven oven;

	public OvenUndoCommand(Oven oven) {
		this.oven = oven;
	}
	
	@Override
	public void execute() {
		oven.undo();
	}
	
}