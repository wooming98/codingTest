import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(String s : strArr) {
            if(!map.containsKey(s.length())) {
                map.put(s.length(), 1);
            } else {
                map.put(s.length(), map.get(s.length())+1);
            }
        }
        int max = 0;
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry<Integer, Integer> entry : entries) {
            if(max < entry.getValue()) {
                max = entry.getValue();
            }
        }
        return max;
    }
}