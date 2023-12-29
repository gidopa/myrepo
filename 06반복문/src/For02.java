
public class For02 {
	public static void main(String[] args) {
		// i=1일때 i<5 true -> 1 찍고 -> i++
		// i=2일때 i<5 true -> 2 찍고 -> i++
		// i=3일때 i<5 true -> 3 찍고 -> i++
		// i=4일때 i<5 true -> 4 찍고 -> i++
		// i=5일때 i<5 false -> for 문 나옴
		int i;
		for (i = 1; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("for문 끝");
		System.out.println(i);
	}
}
// 자동 정렬 단축키 ctrl + shift + f
