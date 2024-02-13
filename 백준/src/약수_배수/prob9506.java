package 약수_배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class prob9506 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<Integer>();
            int sum = 0;

            if (n == -1) {
                break;
            }

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            if (n == sum) {
                sb.append(n).append(" = ");
                for (int i = 0; i < list.size() - 1; i++) {
                    sb.append(list.get(i)).append(" + ");
                }
                sb.append(list.get(list.size() - 1)).append("\n");
            } else {
                sb.append(n).append(" is Not perfect.\n");
            }
        }
        System.out.println(sb.toString());
    }
}
