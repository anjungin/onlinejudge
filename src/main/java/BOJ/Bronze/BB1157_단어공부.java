package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BB1157_단어공부 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine().toUpperCase();
        Integer[] arr = new Integer[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }

        while (!n.isEmpty()) {
            char first = n.charAt(0);
            int distance = n.length() - n.replaceAll(String.valueOf(first),"").length();
            arr[first - 65] = distance;
            n = n.replaceAll(String.valueOf(first),"");
        }

        int max=0;
        int secondMax=0;
        int str = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max<=arr[i]) {
                secondMax=max;
                max=arr[i];
                str = i;
            }
        }

        if (max==secondMax) {
            System.out.println("?");
            return;
        }

        System.out.print((char)(str+65));
    }
}
