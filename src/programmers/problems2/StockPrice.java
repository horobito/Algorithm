package programmers.problems2;

public class StockPrice {
    // https://programmers.co.kr/learn/courses/30/lessons/42584
    public int[] solution(int[] prices) {
        int[] answer = {};
        int[] seconds = new int[prices.length];

        for(int i =0; i <prices.length; i++){
            int count = 0;
            for (int j = i+1; j<prices.length; j++ ){
                count++;
                if(prices[j]<prices[i]){
                    seconds[i] = count;
                    break;
                }
                seconds[i] = count;
            }
        }
        seconds[prices.length-1] = 0;
        return seconds;
    }
    /*
    각 index마다 배열의 진행과정에서 확인


     */
}
