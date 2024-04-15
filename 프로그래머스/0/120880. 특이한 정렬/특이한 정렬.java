import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i : numlist) {
            list.add(i);
        }
        
        int[] answer = new int[numlist.length];
        int idx = 0;
        while(list.size() != 0) {
            int temp = list.get(0);
            for(int i=0; i<list.size(); i++) {
                if(Math.abs(temp - n) > Math.abs(list.get(i) - n) ||
                  (Math.abs(temp - n) == Math.abs(list.get(i) - n) && temp < list.get(i))) {
                    temp = list.get(i);
                }
            }
            answer[idx++] = temp;
            list.remove(Integer.valueOf(temp));
        }
        return answer;
    }
}