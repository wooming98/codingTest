import java.util.*;
class Solution {
    public long solution(long n) {
        String[] array = (n+"").split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Long.parseLong(String.join("", array));
    }
}