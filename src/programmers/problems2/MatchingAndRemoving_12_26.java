package programmers.problems2;

public class MatchingAndRemoving_12_26 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
    }
    public static int solution(String s)
    {
        int[] alphabets = new int[26];
        int slength = s.length();
        for (int i =0; i<slength; i++){
            int index = s.charAt(i) - 97;
        }

        for (int num : alphabets){
            if(num%2==1){
                return 0;
            }
        }

        int count = 0;
        int sameThings = 0;

        char std =0;
        String tempSt = "";

        int length = 0;
        boolean possible = true;
        while (possible){
            length = s.length();
            if(length>0){
                std = s.charAt(0);
            }
            for (int i =1; i<length; i++){

                if(std==s.charAt(i)){
                    sameThings++;
                    count +=1;
                }else {
                    if(sameThings==0){
                        tempSt += Character.toString(std);
                        std = s.charAt(i);

                    }else {
                        std = s.charAt(i);

                    }
                    sameThings =0;
                }

            }

            s= new String(tempSt);
            tempSt = new String("");

            if (count==0){
                possible = false;
            }
            count=0;
        }

        return  (length==0) ? 1 : 0;

    }
}
// 만약 위치에 상관없이 같은 알파벳들을 제거할 수 있으면,

//        return 1;


