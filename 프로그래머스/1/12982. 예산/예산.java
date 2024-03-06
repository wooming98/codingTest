import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum  = 0;
        int count = 0;
        for(int i : d) {
            sum += i;
            count++;
        }
    
        if(budget < sum) {
            for(int i=d.length-1; i>=0; i--) {
                sum -= d[i];
                count--;
                if(budget >= sum) {
                    break;
                }
            }
        } else {
            return count;
        }
        return count;
    }
}