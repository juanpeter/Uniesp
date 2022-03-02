package modelo;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {

	private List<Command> history = new ArrayList<>();
	
	public List<Command> getHistory() {
		return history;
	}

	public void pushCommand(Command c) {
		this.history.add(c);
	}
	
	public void popQueuedCommand() {
		this.history.remove(0);
	}
}
