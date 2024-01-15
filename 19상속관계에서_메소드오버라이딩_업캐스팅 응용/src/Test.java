// 업캐스팅을 하는 이유 -> 다형성 특징 사용 
//
public class Test {

	public static void main(String[] args) {
		Drunken d1 = new Drunken();
		BoneHangover bone1 = new BoneHangover();
		SproutHangover bean1 = new SproutHangover();
		
		d1.hangoverSalting(bone1);
		d1.hangoverSalting(bean1);
		
	}

}

class Hangover{
	//간맞추기 기능 출력
	public void salting() {
		System.out.println("소금치기");
	}
}
class BoneHangover extends Hangover{
	
	@Override
	public void salting() {
		System.out.println("뼈해 : 들깨가루 넣기");
	}

	public void addBone() {
		System.out.println("뼈추가");
	}
}

class SproutHangover extends Hangover{
	
	@Override
	public void salting() {
		System.out.println("콩나물 해장국 : 고추가루");
	}

	public void addSprout() {
		System.out.println("콩나물 추가");
	}
}

class Drunken{
//	public void 뼈다귀해장국간맞추기(뼈다귀해장국 뼈다귀해장국) {
//		뼈다귀해장국.간맞추기();
//	}
//	public void 콩나물해장국간맞추기(콩나물해장국 콩나물해장국) {
//		콩나물해장국.간맞추기();
//	}
	//업캐스팅
	public void hangoverSalting(Hangover hangover) {
		hangover.salting();
	}
}



