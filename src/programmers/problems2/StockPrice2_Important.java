package programmers.problems2;

import java.util.Stack;

public class StockPrice2_Important {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3};
        solution(arr);
    }

    public static int[] solution(int[] prices) {

        Stack<Integer> st = new Stack<>();
        int i =0;
        int[] seconds = new int[prices.length];

        st.push(i);

        for(i=1; i<prices.length; i++){
            // 주식값이 기존값보다 낮을 때
            // stack 내부의 값들 특징 이용
            while (!st.isEmpty() && prices[i] < prices[st.peek()]){
                int beginIdx = st.pop(); // 비교의 기준이 된 index
                seconds[beginIdx] = i- beginIdx; // 저장
            }
            st.push(i); // 그 index의 값이 항상 이전보다 같거나 클때만 저장 
        }
        // 맨 마지막까지 자기보다 작은 값이 안나온 것들
        while (!st.isEmpty()){
            int beginIdx = st.pop(); // 그 index 뽑아내기
            seconds[beginIdx] = i - beginIdx - 1; // for구문 끝나면 i가 증가하므로
        }
        return seconds;
    }
}
