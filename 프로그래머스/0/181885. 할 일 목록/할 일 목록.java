import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<finished.length; i++) {
            if(finished[i] == false) {
                list.add(todo_list[i]);
            }
        }
        String[] array = new String[list.size()];
        for(int i=0; i<array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}