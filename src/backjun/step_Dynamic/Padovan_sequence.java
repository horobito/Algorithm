package backjun.step_Dynamic;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Padovan_sequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Long> triangles = new LinkedList<>();


        int testNum = Integer.parseInt(br.readLine());

        String line = "";
        for (int j =0; j<testNum; j++){

            while (!triangles.isEmpty()){
                triangles.poll();
            }
            triangles.add(1L);
            triangles.add(1L);
            triangles.add(1L);
            triangles.add(2L);
            triangles.add(2L);

            long top = 2L;
            long bottom = 1L;

            int num = Integer.parseInt(br.readLine());

            switch (num){
                case 1:
                    System.out.println(1L);
                    break;
                case 2:
                    System.out.println(1L);
                    break;
                case 3:
                    System.out.println(1L);
                    break;
                case 4:
                    System.out.println(2L);
                    break;
                case 5:
                    System.out.println(2L);
                    break;

            }

            if(num>5){
                for (int i =6; i<=num; i++){
                    top = top + bottom;
                    triangles.add(top);
                    triangles.poll();
                    bottom = triangles.peek();
                }
                System.out.println(top);
            }

        }

    }
}
