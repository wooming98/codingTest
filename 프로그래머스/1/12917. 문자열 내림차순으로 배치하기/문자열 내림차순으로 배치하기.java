import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for(int i=s.length()-1; i>=0; i--) {
            answer += c[i];
        }
        return answer;
    }
}