package backjun.step6_MonoDimention;

import java.io.*;

public class Num3_Count {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        int mp = 1;

        while ((line=br.readLine())!=null){
            try {
                int a = Integer.parseInt(line);
                mp *= a;
            }catch (Exception e){
                break;
            }

        }
        String[] arr;

        arr = Integer.toString(mp).split("");

        int[] answer = new int[10];


        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("0")){
                answer[0] +=1 ;
                continue;
            }else if(arr[i].equals("1")){
                answer[1]+=1 ;
                continue;
            }else if(arr[i].equals("2")){
                answer[2]+=1 ;
                continue;
            }else if(arr[i].equals("3")){
                answer[3]+=1 ;
                continue;
            }else if(arr[i].equals("4")){
                answer[4]+=1 ;
                continue;
            }else if(arr[i].equals("5")){
                answer[5]+=1 ;
                continue;
            }else if(arr[i].equals("6")){
                answer[6]+=1 ;
                continue;
            }else if(arr[i].equals("7")){
                answer[7]+=1 ;
                continue;
            }else if(arr[i].equals("8")){
                answer[8]+=1 ;
                continue;
            }else if(arr[i].equals("9")){
                answer[9]+=1 ;
                continue;
            }
        }

        for(int i=0; i<answer.length; i++){
            bw.write(answer[i]+"\n");
        }
        bw.flush();
        bw.close();

    }
}
