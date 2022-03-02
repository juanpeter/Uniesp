package controle;

import modelo.Command;
import modelo.CommandQueue;

public class Game {

	private CommandQueue commandQueue;
	
	public CommandQueue getCommandQueue() {
		return commandQueue;
	}

	public void setCommandQueue(CommandQueue commandQueue) {
		this.commandQueue = commandQueue;
	}

	public void createGame() {
		CommandQueue cq = new CommandQueue();
		this.commandQueue = cq;
	}
	
	public void executeCommandQueue() {
		while (!commandQueue.getHistory().isEmpty()) {
			Command c = commandQueue.getHistory().get(0);
			c.execute();
			commandQueue.popQueuedCommand();
		}
	}

}
