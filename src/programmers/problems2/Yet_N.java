package programmers.problems2;

public class Yet_N {
    public String solution(int n, int t, int m, int p) {
        String base = "";

        for (int i =0; i<t; i++){
            int temp = i;
            if(n<11){
                while (temp>0){
                    base += temp%n;
                    temp = temp/n;
                }

            }else {
                while (temp>0){

                    switch (temp%n){
                        case 10:
                            base += "A";
                        case 11:
                            base += "B";
                        case 12:
                            base += "C";
                        case 13:
                            base += "D";
                        case 14:
                            base += "E";
                        case 15:
                            base += "F";
                        default:
                            base += t%n;
                    }
                    temp = temp/n;
                }

            }
        }

        String answer = "";
        for (int i =0; i<t; i++){
            answer += base.charAt(i*m+p-1);
        }
        return answer;

    }
}
