package programmers.problems1;

public class MakeStrangeString {
    public static void main(String[] args) {
        solution("try hello world");
    }

    public static String solution(String s) {
        String tempArr = "";
        String answer = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' ' && i!=s.length()-1){
                tempArr +=s.charAt(i);

            }else {
                if(i==s.length()-1){
                    tempArr += s.charAt(i);
                }

                for(int j=0; j<tempArr.length(); j++){
                    if(j%2 ==0){
                        if(Character.isLowerCase(tempArr.charAt(j))){
                            char a = (char) (tempArr.charAt(j) -32);
                            answer += a;
                        }else {
                            char a = tempArr.charAt(j);
                            answer += a;
                        }
                    }else {
                        if(Character.isUpperCase(tempArr.charAt(j))){
                            char a = (char) (tempArr.charAt(j) +32);
                            answer += a;
                        }else {
                            char a = tempArr.charAt(j);
                            answer += a;
                        }
                    }
                }
                if(i!=s.length()-1){
                    answer += " ";
                }
                tempArr = "";
            }
        }


        return answer;
    }
}
