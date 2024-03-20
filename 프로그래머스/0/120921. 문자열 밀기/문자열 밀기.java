import java.util.*;
class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) {
            return 0;
        }
        List<String> list = new ArrayList<>();
        for(int i=0; i<A.length(); i++) {
            list.add(""+A.charAt(i));
        }
        int idx = 0;
        for(int i=0; i<list.size(); i++) {
            if(!String.join("", list).equals(B)) {
                list.add(0, list.get(list.size()-1));
                list.remove(list.size()-1);
                idx++;
            } else {
                return idx;
            }
        }
        return -1;
    }
}