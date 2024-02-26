import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            int k = 0;
            for(int j : delete_list) {
                if(i!=j) {
                    k++;
                }
                if(k == delete_list.length) {
                    list.add(i);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}