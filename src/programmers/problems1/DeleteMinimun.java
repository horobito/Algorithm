package programmers.problems1;


public class DeleteMinimun {
    public int[] solution(int[] arr) {
        int[] answer;
        int min = arr[0];
        int index = 0;
        for(int i =0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
                index = i;
            }
        }

        int arrIndex = 0;
        if(arr.length>1){
            answer = new int[arr.length-1];
            for(int i=0; i<index; i++){
                answer[arrIndex++] = arr[i];
            }
            for(int i=index+1; i<arr.length; i++){
                answer[arrIndex++] = arr[i];
            }
        }else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}
