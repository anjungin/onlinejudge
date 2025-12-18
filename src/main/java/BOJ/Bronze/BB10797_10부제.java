package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BB10797_10부제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String day = br.readLine();
        String[] T = br.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < T.length; i++) {
            if (T[i].equals(day)) sum++;
        }
        System.out.println(sum);
    }
}
