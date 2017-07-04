package core7_III;

import static core7_III.LevelComplexity.*;

public enum GameLevel {

		LOW(low, "low skill gamer", 1), 
		MIDDLE(middle, "middle skill gamer", 2), 
		HIGH(high, "high skill gamer", 3);
	
		private LevelComplexity levelComplexity;
		private String skill;
		private int levelNum;
		
		GameLevel(LevelComplexity levelComplexity, String skill, int levelNum) {
			this.levelComplexity = levelComplexity;
			this.skill = skill;
			this.levelNum = levelNum;
		}
		
		public LevelComplexity getLevelComplexity() {
			return levelComplexity;
		}

		public String getSkill() {
			return skill;
		}

		public int getLevelNum() {
			return levelNum;
		}
		
}
