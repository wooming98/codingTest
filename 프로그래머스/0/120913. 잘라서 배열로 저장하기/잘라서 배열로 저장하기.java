import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<my_str.length(); i+=n) {
            if(my_str.length() - i >= n) {
                list.add(my_str.substring(i, n+i));
            } else {
                list.add(my_str.substring(i));
            }
        }
        String[] arr = new String[list.size()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}