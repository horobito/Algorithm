package programmers.problems2;

import java.util.HashMap;

public class Yet_Hash_PhoneNumberList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> hm = new HashMap<>();
        for(String phone_number : phone_book){
            hm.put(phone_number, hm.getOrDefault(phone_number, 0)+1);
        }

        return answer;
    }


    /*
    하나의 번호가 다른 번호의 접두어일 경우 false,
    어떤 것도 다른 것의 접두어가 아닐 경우,  true.

    특징 : 같은 키가 중복되면 덮힌다.

    hashmap에 다 몰어넣은 뒤(value는 1로),
    하나의 값을 정한 후, 나머지 값을 subString으로 해서 비교 한 후에,





     */
}
