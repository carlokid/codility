// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// test edit
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for(int i=0; i<A.length; i++){
            if(i%2==0){
                if(i==A.length-1) return A[i];
                if(A[i]!=A[i+1]){
                    return A[i];
                }
            }
        }
        return -1;
    }
}