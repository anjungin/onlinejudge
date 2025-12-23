package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BB1157_단어공부 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine().toUpperCase();
        int max=0;
        String aphabet = "";

        while (n.length()!=0) {
            char first = n.charAt(0);
            int distance = n.length() - n.replaceAll(String.valueOf(first),"").length();
            if (max==distance) {
                System.out.println("?");
                return;
            } else if (max<distance) {
                max=distance;
                aphabet= String.valueOf(first);
            }
            n = n.replaceAll(String.valueOf(first),"");
        }

        System.out.println(aphabet);
    }
}
