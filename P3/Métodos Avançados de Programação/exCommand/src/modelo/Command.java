package modelo;

public abstract class Command {
	
	private int animationTime;
	
	public int getAnimationTime() {
		return animationTime;
	}

	public void setAnimationTime(int animationTime) {
		this.animationTime = animationTime;
	}
	
	public Command() {}
	
	public Command(int animationTime) {
		this.animationTime = animationTime;
	}

	public abstract void execute();
}
