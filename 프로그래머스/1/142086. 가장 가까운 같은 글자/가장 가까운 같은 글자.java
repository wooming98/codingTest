import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            int k = 0;
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                answer[i] = -1;
            } else {
                for(int j=i; j>=0; j--) {
                    if(s.charAt(i) == s.charAt(j) && i!=j) {
                        k = i - j;
                        answer[i] = k;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}