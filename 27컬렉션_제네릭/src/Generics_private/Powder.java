package Generics_private;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Powder extends Material{

	@Override
	public String toString() {
		return "재료는 Powder 입니다";
	}
	public void doPrinting() {
		System.out.println("powder 재료로 출력");
	}
}
