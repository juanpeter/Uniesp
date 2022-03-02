package visao;

import controle.Game;
import modelo.Command;
import modelo.JumpCommand;
import modelo.ShootCommand;
import modelo.SlideCommand;

public class Partida {

	public static void main(String[] args) {
		Game newGame = new Game();
		newGame.createGame();
		
		Command jump = new JumpCommand(3);
		Command shoot = new ShootCommand(1);
		Command slide = new SlideCommand(2);
		
		newGame.getCommandQueue().pushCommand(shoot);
		newGame.getCommandQueue().pushCommand(shoot);
		newGame.getCommandQueue().pushCommand(jump);
		newGame.getCommandQueue().pushCommand(jump);
		newGame.getCommandQueue().pushCommand(shoot);
		newGame.getCommandQueue().pushCommand(slide);
		newGame.getCommandQueue().pushCommand(shoot);


		newGame.executeCommandQueue();
	}

}
