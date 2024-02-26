import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int k : arr) {
            for(int i=0; i<k; i++) {
                list.add(k);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0; i<result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}