package backjun.step6_MonoDimention;


import java.io.*;

public class Num6_Yet_O_And_X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        String line;

        while (!(line=br.readLine()).equals("")){
            String[] arr = line.split("");
            int o = 0;
            int score = 0;
            int total = 0;

            for(int i=0; i<arr.length; i++){
                if(arr[i].equals("O")){
                    score = 1+o;
                    total += score;
                    o++;
                } else {
                    o = 0;
                }
            }

            bw.write(total + "\n");


        }

        bw.flush();
        bw.close();
    }
}
