import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] array = my_string.split(" ");
        List<String> list = new ArrayList<>();
        for(String s : array) {
            if(!s.isEmpty()) {
                list.add(s);
            }
        }
        String[] array2 = new String[list.size()];
        for(int i=0; i<array2.length; i++) {
            array2[i] = list.get(i);
        }
        return array2;
    }
}