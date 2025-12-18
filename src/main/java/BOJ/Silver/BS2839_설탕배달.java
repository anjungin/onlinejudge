package BOJ.Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BS2839_설탕배달 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int kg = Integer.parseInt(br.readLine());
       int result = -1;
       if (kg%5==0) {
           result = kg / 5;
       } else {
           for (int i = kg/5; 0 <=i ; i--) {
               for (int j = 0; j <= kg/3; j++) {
                   if (result!=-1) break;
                   if (i*5+j*3==kg) {
                        result=i + j;
                   }
               }
           }
       }
        System.out.println(result);
    }
}