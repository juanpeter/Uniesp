package ted05.modelo;

public class MazeFactory extends AbstractMazeFactory{
	
	String makeMaze() {
		return "Labirinto feito";
	}

	@Override
	String makeWall() {
		return "Parede feita";
	}

	@Override
	EnchantedRoom makeRoom() {
		return new EnchantedRoom();
	}

	@Override
	String makeDoor() {
		return "Porta feita";
	}

}
