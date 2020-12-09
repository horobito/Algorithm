package programmers.problems1;


import java.util.Stack;

public class YetFreeOrder {
    public static void main(String[] args) {
        String[] arr = {"abce", "abcd", "cdx"};
        int n = 2;
        solution(arr, n);
    }
    public static String[] solution(String[] strings, int n) {


        Stack<String> st = new Stack<>();
        Stack<String> temp = new Stack<>();

        for (String element : strings){
            // 막히는 원인
            while (!st.isEmpty() && !(st.peek().charAt(n) > element.charAt(n))){
                if(st.peek().charAt(n) == element.charAt(n)){
                    if(!findBigger(st.peek(), element, n).equals(st.peek())){
            // 막히는 원인 -> break문의 부재
                        temp.add(st.pop());
                    }else {break;}
                }else {
                    temp.add(st.pop());
                }
            }


            st.add(element);
            while (!temp.isEmpty()){
                st.add(temp.pop());
            }
        }

        String[] answer = new String[st.size()]; // 1. 배열길이 오류의 원인

        for(int i =0; i<answer.length; i++){ //  2.st.size와 같이 해당 과정에서 변하는 값은 넣지 말아야 한다.
            answer[i] = st.pop();
        }

        return answer;
    }

    private static String findBigger(String pre, String pro, int n){
        int preLength = pre.length();
        int proLength = pro.length();
        int length = Math.min(preLength, proLength);
        String bigger = "";
        for (int i =0; i<length; i++){
            if(i ==n){ continue; }
            if(pre.charAt(i) != pro.charAt(i)){
                bigger = pre.charAt(i) > pro.charAt(i)? pre : pro;
                break; // 주의
            }
        }
        return bigger;
    }
}
