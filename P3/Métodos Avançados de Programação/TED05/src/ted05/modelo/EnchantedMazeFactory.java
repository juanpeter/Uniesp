package ted05.modelo;

public class EnchantedMazeFactory extends AbstractMazeFactory {

	@Override
	String makeMaze() {
		return "Labirinto encantado feito";
	}

	@Override
	String makeWall() {
		return "Parede encantada feita";
	}

	@Override
	Room makeRoom() {
		return new Room();
	}

	@Override
	String makeDoor() {
		return "porta encantada feita";
	}

}
