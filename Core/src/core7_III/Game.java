package core7_III;

public class Game {

	GameLevel level;

	public Game(GameLevel level) {
		super();
		this.level = level;
	}

	public Game() {
		super();
	}
	
	public GameLevel getGameLevel() {
		return level;
	}
	
	public void setGameLevel(GameLevel level) {
		this.level = level;
	}
	
}
