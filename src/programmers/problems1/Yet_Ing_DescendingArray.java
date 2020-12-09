package programmers.problems1;

import java.util.Stack;

public class Yet_Ing_DescendingArray {
    public String solution(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Character> temp = new Stack<>();
        st.add(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            while (st.peek()>s.charAt(i) && !st.isEmpty()){
                temp.add(st.pop());
            }
            st.add(s.charAt(i));
            while (!temp.isEmpty()){
                st.add(temp.pop());
            }
        }

        String answer = "";
        while (!st.isEmpty()){
            answer+= Character.toString(st.pop());
        }

        return answer;
    }
}
