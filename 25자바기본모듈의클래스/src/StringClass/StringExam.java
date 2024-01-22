package StringClass;

public class StringExam {

	public static void main(String[] args) {
		String original = "Hello, World!";
		String deleteString = "l";
		System.out.println(original);
		String modifiedString = "";
		String deletedString = "";		
		for(int i=0;i<original.length();i++) {
			if(original.substring(i,i+1).equals(deleteString)) {
				modifiedString += original.substring(i, i+1);
				deletedString = original.replace(String.valueOf(deleteString), "");
			}
		}
		System.out.println(original);
		System.out.println(modifiedString);
		System.out.println(deletedString);
	}

}
