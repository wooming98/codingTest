import java.math.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        
        int min = arr[0];
        for(int i : arr) {
            min = Math.min(i, min);
        }
        
        int idx = 0;
        for(int i : arr) {
            if(i != min) {
                answer[idx++] = i;
            }
        }
        return answer;
    }
}