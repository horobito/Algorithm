package programmers.problems1;

public class HidePhoneNumeber {
    public String solution(String phone_number) {
        String answer = "";
        String lastFour = phone_number.substring(phone_number.length()-4, phone_number.length());
        answer = String.format("%" + phone_number.length() +"s", lastFour);
        answer = answer.replaceAll(" ", "*");
        return answer;
    }
}
