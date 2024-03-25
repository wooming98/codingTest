class Solution {
    public String solution(String s) {
        String answer = "";
        // 공백이 나오면 n=0으로 처리
        // 문자가 나오면 n=0이 아닐 때, 대문자 소문자 ..로 처리
        int n = -1;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                n = -1;
                answer += s.charAt(i);
            } else {
                n++;
                if(n % 2 == 0) {
                    answer += Character.toUpperCase(s.charAt(i));
                } else {
                    answer += Character.toLowerCase(s.charAt(i));
                }
            }
        }
        return answer;
    }
}