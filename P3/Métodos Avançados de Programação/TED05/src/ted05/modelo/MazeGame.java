package ted05.modelo;

public class MazeGame {
	
	public AbstractMazeFactory createMaze(boolean enchanted) {
		if (enchanted) {
			return new EnchantedMazeFactory();
		} else {
			return new MazeFactory();
		}
	}
}
