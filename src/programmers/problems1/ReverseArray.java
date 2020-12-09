package programmers.problems1;

import java.util.Stack;

public class ReverseArray {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Stack<Character> answerST = new Stack<>();
        Stack<Character> temp = new Stack<>();

        for (char index : arr){
            // 비교시  stack 비어있는지 확인 및 순서 비교
            // 비교순서 중요
            while ( !answerST.isEmpty() && answerST.peek()>index){
                temp.add(answerST.pop());
            }
            answerST.add(index);
            while (!temp.isEmpty()){
                answerST.add(temp.pop());
            }
        }

        while (!answerST.isEmpty()){
            answer += answerST.pop();
        }

        return answer;
    }
}
// stackEmpty문제 -
