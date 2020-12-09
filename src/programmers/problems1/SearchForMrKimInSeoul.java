package programmers.problems1;

public class SearchForMrKimInSeoul {
    public String solution(String[] seoul) {
        String answer = "";
        int x = 0;
        for(String person : seoul){
            if(person.equals("Kim")){
                break;
            }
            x++;
        }
        return answer = "김서방은 " + x + "에 있다";
    }
}
