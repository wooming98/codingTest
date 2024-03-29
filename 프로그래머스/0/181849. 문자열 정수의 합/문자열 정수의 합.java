class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] array = num_str.split("");
        for(String i : array) {
            answer += Integer.parseInt(i);
        }
        return answer;
    }
}