package programmers.problems1;

public class Average {
    public double solution(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        for(int a : arr){
            sum += a;
        }
        return (double)sum/arr.length;
    }
}
