import java.util.*;
class Solution {
    public long solution(long n) {
        String[] array = (n+"").split("");
        Arrays.sort(array, Collections.reverseOrder());
        String str = "";
        for(String s : array) {
            str += s;
        }      
        return Long.parseLong(str);
    }
}