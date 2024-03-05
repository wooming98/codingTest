import java.util.*;
import java.math.*;
class Solution {
    public int[] solution(int[] arr) {
        double n = 0;
        for(int i=0; i<arr.length; i++) {
            n = Math.pow(2, i);
            if(arr.length <= n) {
                break;
            }
        }
        int[] answer = Arrays.copyOf(arr, (int)n);
        return answer;
    }
}