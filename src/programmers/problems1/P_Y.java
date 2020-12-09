package programmers.problems1;

public class P_Y {
    boolean solution(String s) {

        int count = 0;

        for(int i =0; i<s.length(); i++){
            char alphabet = s.charAt(i);
            if(alphabet=='p' || alphabet =='P'){ count++;}
            if(alphabet=='y' || alphabet =='Y'){ count--;}
        }

        return count==0;
    }
}

//    boolean solution(String s) {
//
//        int pCount = 0;
//        int yCount = 0;
//
//        for(int i =0; i<s.length(); i++){
//            int alphabet = s.charAt(i);
//            if(alphabet=='p' || alphabet =='P'){ pCount++;}
//            if(alphabet=='y' || alphabet =='Y'){ pCount++;}
//        }
//
//        return pCount==yCount? true : false;
//    }
