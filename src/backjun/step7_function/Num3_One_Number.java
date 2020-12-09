package backjun.step7_function;

import java.util.Scanner;

public class Num3_One_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;

        if(n<100){
            answer = n;
        }else {
            answer = 99;
            boolean sequence = true;

            for (int i = 100; i<=n; i++){
                int differ = i%10 - (i/10)%10;

                int num = i/10;

                while (num>=10){
                    sequence = true;// 밑의 false가 다음 번에도 영향을 주는것을 주의
                    if((num%10 - (num/10)%10)!=differ){
                        sequence = false;
                        break;
                    }
                    num = num/10;
                }

                if(sequence==false){
                    continue;
                }

                answer++;

            }
        }
        System.out.println(answer);
    }
}
