package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BB1225_이상한곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] T = br.readLine().split(" ");
        long sum = 0;
        if (T[0].equals("0") || T[1].equals("0")) {
            System.out.println(0);
        } else {
            for (int i = 0; i < T[0].length(); i++) {
                for (int j = 0; j < T[1].length(); j++) {
                    sum += Long.parseLong(T[0].substring(i, i + 1)) * Long.parseLong(T[1].substring(j, j + 1));
                }
            }
            System.out.println(sum);
        }
    }
}
