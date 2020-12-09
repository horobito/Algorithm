package backjun.Step8_String;

import java.util.HashMap;
import java.util.Scanner;

public class Num3_Find_Alphabet {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();


        for (int i =string.length()-1; i>=0; i--){
            hm.put(string.charAt(i), i);
        }

        for (int i = 97; i<123; i++){
            char a = (char)i;
            hm.put(a, hm.getOrDefault(a, -1));
            System.out.print(hm.get(a) + " ");
        }

            /*
            문자 형식으로 hash에 저장,
            이후 for 구문으로 아스키코드 61부터 찾은다음 없으면 value를 -1로 하고,
            이후 바로 출력
             */
    }
}
