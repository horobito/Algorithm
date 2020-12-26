package programmers.problems2;

public class Fibonacci_12_26 {
    public int solution(int n) {

        int[] fabonacciArrays = new int[n+1];
        fabonacciArrays[0] = 0;
        fabonacciArrays[1] = 1;

        for (int i=2; i<=n; i++){
            fabonacciArrays[i]
                    = (fabonacciArrays[i-1] +fabonacciArrays[i-2]%1234567);
        }

        return fabonacciArrays[n];
    }

}
