package backjun.step7_function;

import java.util.StringTokenizer;

public class Test {
    public long sum(int[] a){
        int sum =0;
        for(int i=0; i<a.length; i++){
            sum+= a[i];
        }
        return sum;
    }
}
