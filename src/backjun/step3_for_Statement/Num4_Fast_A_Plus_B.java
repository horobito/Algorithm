package backjun.step3_for_Statement;


import java.io.*;
import java.util.StringTokenizer;

public class Num4_Fast_A_Plus_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int test = Integer.parseInt(br.readLine());

        int[] arr = new int[test];

        for(int i=0; i<test; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i] = a+b;

            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();



    }
}

//        Scanner sc = new Scanner(System.in);
//
//        int test = sc.nextInt();
//
//        int[] arr = new int[test];
//
//        for(int i=0; i<test; i++){
//            int a = sc.nextInt();
//            int b= sc.nextInt();
//            arr[i] = a+b;
//        }
//
//        for(int a : arr){
//            System.out.println(a);
//        }
