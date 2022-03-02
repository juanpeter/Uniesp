package modelo;

import java.util.concurrent.TimeUnit;

public class ShootCommand extends Command {

	public ShootCommand(int animationTime) {
		this.setAnimationTime(animationTime);
	}

	public void execute() {
		try {
			TimeUnit.SECONDS.sleep(this.getAnimationTime());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Atirar!");
	}
}
