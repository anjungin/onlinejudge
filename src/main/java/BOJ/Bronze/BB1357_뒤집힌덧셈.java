package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BB1357_뒤집힌덧셈 {
    public static int reverseNumber(String a) {
        StringBuilder sb = new StringBuilder(a);
        for (int j = 0; j < a.length() / 2; j++) {
            char temp = sb.charAt(j);
            sb.setCharAt(j,sb.charAt(a.length()-1-j));
            sb.setCharAt(a.length()-1-j, temp);
        }

        return Integer.parseInt(String.valueOf(sb));
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int sum = 0;
        for (String num : nums) {
            int rs = reverseNumber(num);
            sum += rs;
        }
        System.out.println(reverseNumber(String.valueOf(sum)));
    }
}
