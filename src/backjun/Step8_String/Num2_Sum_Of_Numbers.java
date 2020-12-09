package backjun.Step8_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Num2_Sum_Of_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String numbers = br.readLine();

        int sum = 0;
        for (int i =0; i<n; i++){
            sum += Integer.parseInt(String.valueOf(numbers.charAt(i)));
            // String 을 int 로 바꾸는 것 주의 !!!1
            // String.valueOf : 다른 타입의 데이터를 String으로 변환한느 것
        }

        System.out.println(sum);

    }
}
