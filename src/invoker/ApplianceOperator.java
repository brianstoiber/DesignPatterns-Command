package invoker;

// invoker used by the JUnit test class
import commands.Command;

public class ApplianceOperator {
	Command slot;
 
	public ApplianceOperator() {
	}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void performAction() {
		slot.execute();
	}
	
}