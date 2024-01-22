package StringBuilder;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("def");
		System.out.println(sb);
		sb.deleteCharAt(3);
		System.out.println(sb);
		sb.replace(1, 3, "BC");
		System.out.println(sb);
		sb.insert(3,"D");
		System.out.println(sb);
		System.out.println(sb.substring(2, 4));
		System.out.println(sb);
		sb.delete(3, 4);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		//메소드 체이닝 기법 -> .연산자를 이용해 메소드로부터 반환받은 객체의 메소드를 다시 호출하는 기법
		String upper =sb.toString().toUpperCase();
		StringBuilder sb_upper = new StringBuilder(upper);
		System.out.println(sb_upper);
		
	}

}
