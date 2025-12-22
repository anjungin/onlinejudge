package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BB10808_알파벳개수 {
    public static void main (String[] args) throws Exception{
        int[] arr = new int[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97] ++;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
