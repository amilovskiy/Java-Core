package core7_II;

import static core7_II.Lightsaber.*;

public enum Sith {
	
	Palpatine(red), Vader(red), Kylo_Ren(red), 
	Dart_Maul(red), Darth_Tyranus(red);
	
	private Lightsaber color;

	Sith(Lightsaber color) {
		this.color = color;
	}

	public Lightsaber getColor() {
		return color;
	}
	
	
}
