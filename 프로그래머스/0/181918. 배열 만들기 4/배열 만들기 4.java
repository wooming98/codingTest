import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            if(list.size() == 0) {
                list.add(arr[i]);
                i++;
            } else if(list.get(list.size()-1) < arr[i]) {
                list.add(arr[i]);
                i++;
            } else if(list.get(list.size()-1) >= arr[i]) {
                list.remove(list.get(list.size()-1));
            }
        }
        int[] answer = new int[list.size()];
        for(int j=0; j<answer.length; j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}