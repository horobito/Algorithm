package backjun.step7_function;

public class Num2_Self_Number {
    public static void main(String[] args) {
        boolean[] nonSelfNums = new boolean[10001];

        for(int i =1; i<10000; i++){

                if(d(i)<10001){
                    nonSelfNums[d(i)] = true;
                }

        }

        for (int i =1; i<=10000; i++){
            if(nonSelfNums[i]==false){
                System.out.println(i);
            }
        }

    }

    private static int d(int n) {
        int sum = n;
        while (n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }

}
