package ted05.modelo;

public abstract class AbstractMazeFactory {

	abstract String makeMaze();
	abstract String makeWall();
	abstract AbstractRoom makeRoom();
	abstract String makeDoor();
}
