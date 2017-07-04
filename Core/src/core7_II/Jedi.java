package core7_II;

import static core7_II.Lightsaber.*;

public enum Jedi {
		
	Kenobi(blue), Master_Yoda(green), Windu(pink), 
	luke_Skywalker(blue), Kit_Fisto(green), Plo_Koon(blue);
	
	private Lightsaber color;
	
	Jedi(Lightsaber color){
		this.color= color;
	}

	public Lightsaber getColor() {
		return color;
	}


}
