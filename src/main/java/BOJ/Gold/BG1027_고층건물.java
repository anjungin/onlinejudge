package BOJ.Gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BG1027_고층건물 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        ArrayList<Integer> result = new ArrayList<>();

        for (int i=0; i<N; i++) {
            int highB = 0;
            int right = 0;
            int left = 0;

            if (i!=0) left= Integer.parseInt(input[i-1]);
            if (i!=N-1) right= Integer.parseInt(input[i+1]);

            for (int j=1; j<=N-i-1; j++) { // 우측에 있는 빌딩 개수 N-i-1
                if (j==1) {
                    highB++;
                } // 바로 우측은 고층 빌딩으로 셈
                else if (right<Integer.parseInt(input[i+j])){ // i기준으로 +j일 때 기존 우측 고층빌딩보다 1이상만큼 큰 지 확인
                    right=Integer.parseInt(input[i+j]); // 우측 고층빌딩 갱신
                    highB++; // 가시고층빌딩 개수 갱신
                } else {
                    break;
                }
            }
            for (int k=1; k<=i; k++) { // 기준빌딩 좌측에 있는 빌딩 개수 i
                if (k==1) {
                    highB++;
                } // 바로 좌측은 고층 빌딩으로 셈
                else if (left<Integer.parseInt(input[i-k])){ // i기준으로 -k일 때 기존 좌측 고층빌딩보다 1이상만큼 큰 지 확인
                    left=Integer.parseInt(input[i-k]); // 좌측 고층빌딩 갱신
                    highB++; // 가시고층빌딩 개수 갱신
                } else {
                    break;
                }
            }
            result.add(highB);
        }

        int maxValue = Collections.max(result);
        System.out.println(maxValue);

    }
}
