class Solution {
    public int solution(int n, int k) {
        
        if(n < 10) {
            return (12000 * n) + (2000 * k);
        } else {
            return (12000 * n) + (2000 * k) - (2000 * (n / 10));
        }
    }
}