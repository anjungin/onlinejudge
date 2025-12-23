package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BB9093_단어뒤집기 {
    public static void main(String[] args) throws Exception {
        // 일단 split 해서 단어 배열 만들고..
        // length가 1이면 그냥 둡시다
        // 2이상이면 (단어길이-1-i)랑 i를 temp 만들어서 자리 바꿉시다(i는 단어길이/2 까지)
        // 끝
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int qty = Integer.parseInt(br.readLine());
        String[] sentence = new String[qty];
        for (int x = 0; x < qty; x++) {
            sentence[x] = br.readLine();
        }
        for (int i = 0; i < qty; i++) {
            String[] words = sentence[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                String word = words[j];
                if (word.length() == 1) {
                    System.out.print(word + " ");
                } else {
                    StringBuilder strb = new StringBuilder(word);
                    for (int k = 0; k < word.length() / 2; k++) {
                        char temp = strb.charAt(word.length() - 1 - k);
                        strb.setCharAt(word.length() - 1 - k, strb.charAt(k));
                        strb.setCharAt(k, temp);
                    }
                    System.out.print(strb);
                    if (j != words.length - 1) System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
