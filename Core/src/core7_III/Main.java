package core7_III;

public class Main {

	public static void main(String[] args) {
		
		/***
		 * values() - статичний метод будь-якого енама, 
			надає масив усіх значень даного енама (працювати як з масивом) 
		 */
		for (int i = 0; i < GameLevel.values().length; i++) {
			System.out.println(GameLevel.values()[i].getLevelComplexity());
			System.out.println(GameLevel.values()[i].getSkill());
			System.out.println(GameLevel.values()[i].getLevelNum());
			System.out.println("");
		}
		
		System.out.println("_____________\n");
		for (int i = 0; i < GameLevel.values().length; i++) {
			if (GameLevel.values()[i].getLevelNum() > 1)
				System.out.println(GameLevel.values()[i].getSkill());
		}
		
//		Game g = new Game(GameLevel.HIGH);
//		
//		System.out.println(g.getGameLevel());
//
//		if (g.getGameLevel() == GameLevel.HIGH)
//			System.out.println("motherfucker gamer");
//		
//		GameLevel str;
//		str = GameLevel.valueOf("MIDDLE");
//		System.out.println(str);
	}

}
