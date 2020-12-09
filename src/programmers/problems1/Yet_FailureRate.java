package programmers.problems1;

import java.util.Stack;

public class Yet_FailureRate {
    public static void main(String[] args) {

        int n = 5;
        int[] arr = {2,1,2,6,2,4,3,3};

        solution(n, arr);
    }

    public static int[] solution(int N, int[] stages) {
        int people = stages.length;
        int[] failureCount = new int[N+1];
        int[] failureRate = new int[N+1];

        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        int[] answer = new int[N];

        for(int i =0; i<stages.length; i++){
            if(stages[i]<=N){
               failureCount[stages[i]]++;
            }
        }

        for(int i =1; i<stages.length; i++){
            if(people!=0){
                failureRate[i] = failureCount[i]/people;
            }else {
                failureCount[i] = 0; }
            people -= failureCount[i];
        }

        int min = failureRate[failureRate.length-1];
        st.add(min);

        for(int i =failureRate.length-2; i>0; i--){
            while (failureRate[i]<st.peek()){
                temp.add(st.pop());
            }
            st.add(failureRate[i]);
            while (!temp.isEmpty()){
                st.add(temp.pop());
            }
        }

        for (int i=0; i<N; i++){
            answer[i] = st.pop();
        }
        return answer;
    }
}
