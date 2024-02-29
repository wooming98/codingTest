import java.util.*;
import java.math.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int temp = Math.abs(n - array[0]);
        int result = array[0];
        for(int i=1; i<array.length; i++) {
            if(Math.abs(n - array[i]) < temp) {
                temp = Math.abs(n - array[i]);
                result = array[i];
            }
        }
        return result;
    }
}