import java.math.*;
class Solution {
    public int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int c = (n * m) / a;
        int[] answer = {a, c};
        
        return answer;
    }
}