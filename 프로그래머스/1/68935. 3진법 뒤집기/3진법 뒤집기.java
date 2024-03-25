class Solution {
    public int solution(int n) {
        String s = "";
        while(n != 0) {
            s += n % 3;
            n /= 3;
        }
        int answer = Integer.parseInt(s, 3);
        return answer;
    }
}