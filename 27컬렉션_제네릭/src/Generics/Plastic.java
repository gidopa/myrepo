package Generics;

public class Plastic extends Material{
	public String toString() {
		return "재료는 Plastic 입니다";
	}

	@Override
	public void doPrinting() {
		System.out.println("plastic 재료로 출력");
	}

}
