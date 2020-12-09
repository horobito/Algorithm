package backjun.step_Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fibonacci_numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] fb = new long[n+1];
        fb[0] = 0;
        fb[1] = 1;

        for (int i =2; i<n+1; i++){
            fb[i] = fb[i-1] + fb[i-2];
        }

        System.out.println(fb[n]);
    }
}
