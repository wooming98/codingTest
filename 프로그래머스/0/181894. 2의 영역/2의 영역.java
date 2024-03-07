import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int a = 0;
        int b = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                a = i;
                break;
            }
        }
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] == 2) {
                b = i;
                break;
            }
        }
        int idx = 0;
        int[] answer = new int[b-a+1];
        for(int i=a; i<=b; i++) {
            answer[idx++] = arr[i];
        }
        if(answer.length == 1 && answer[0] != 2) {
            answer[0] = -1;
        }
        return answer;
    }
}