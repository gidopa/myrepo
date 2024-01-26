package Generics_private;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Printer <T extends Material>{
	private T material;

	@Override
	public String toString() {
		return material.toString();
	}
	public void printing() {
		material.doPrinting();
	}
}
