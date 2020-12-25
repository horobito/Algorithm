package programmers.problems2;

import java.util.Arrays;

public class MakeBigNumber_12_25 {
    public static void main(String[] args) {
        String numbers = "1924";
        int k = 2;
        System.out.println(solution(numbers, k));
    }

    public static String solution(String number, int k) {
        String std = "0";
        String comparsion = "";
        String[] arr = number.split("");
        int lenght = number.length();
        int count = k+1;

        recurse(count, comparsion, -1, std, lenght, arr);

        return std;
    }


    public static void recurse(int count, String comparsion, int lastIndex, String std, int length, String[] arr ){
        int k = count-1;
        int startIndex = lastIndex+1;
        for (int i = startIndex; i<length-(k+1); i++){
            comparsion += arr[i];
            if(k>1){
                recurse(k, comparsion, startIndex, std, length, arr);
            }else {
                if(Integer.parseInt(std)<Integer.parseInt(comparsion)){
                    std = comparsion;
                }
            }
        }


    }
}
