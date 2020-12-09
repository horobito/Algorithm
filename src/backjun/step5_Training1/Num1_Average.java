package backjun.step5_Training1;

import java.io.*;
import java.util.StringTokenizer;

public class Num1_Average {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        int sum = 0;
        while ((line=br.readLine())!=null){
            try {
                StringTokenizer st = new StringTokenizer(line);
                int score = Integer.parseInt(st.nextToken());

                if(score<40){
                    sum += 40;
                }else{
                    sum += score;
                }
            }catch (Exception e){
                break;
            }

        }

        System.out.println(sum/5);



    }
}

//    Scanner sc = new Scanner(System.in);
//
//    int sum =0;
//
//    int people = 0;
//
//        while(sc.hasNextInt()){
//
//                int score = sc.nextInt();
//                if(score<40){
//        sum+=40;
//        people ++;
//        }else{
//        sum+=score;
//        people ++;
//        }
//
//        }
//
//        System.out.println(sum/people);
