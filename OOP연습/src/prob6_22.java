public class prob6_22 {

    public static void main(String[] args) {
        String str = "123";
        String str1 = "123o";
        System.out.println(isNumber(str));
        System.out.println(isNumber(str1));
    }

    public static boolean isNumber(String str) {
        boolean res = false;
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
