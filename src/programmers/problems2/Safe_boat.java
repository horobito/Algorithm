package programmers.problems2;

import java.util.Arrays;

public class Safe_boat {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int front = 0;
        int back = people.length-1;

        while (front<=back){
            int sum = people[front] + people[back];
            if(sum<=limit){
                front++;
                back--;
            }else {
                back--;
            }

            answer++;

        }

        return answer;
    }
}
