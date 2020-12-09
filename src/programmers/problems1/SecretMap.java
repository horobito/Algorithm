package programmers.problems1;


public class SecretMap {
    public static void main(String[] args) {
        int n = 1;
        int[] arr = {22};
        int[] arr2 = {14};
        solution(n, arr, arr2);
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[][]secretMapString = new String[n][n];

        for(int i=0; i<n; i++){
            answer[i] = "";// null값 제거
            String temp1  = Integer.toBinaryString(arr1[i]|arr2[i]);
            String temp2 = "";

            int length = temp1.length();

            if(length!=6){
                while (length<n){
                    temp2 += "0";
                    length++;
                }
            }

            temp2 += Integer.toBinaryString(arr1[i]|arr2[i]);
            secretMapString[i] = temp2.split("");

            for(int j=0; j<n; j++){ // 조건 주의
                if(secretMapString[i][j].equals("0")){ // 문자열 비교 주의
                    answer[i] += " ";
                }else {
                    answer[i] += "#";
                }
            }

        }

        return answer;
    }
}
