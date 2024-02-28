import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        switch(n) {
            case 1:
                for(int i=0; i<=slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 2:
                for(int i=slicer[0]; i<num_list.length; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 3:
                for(int i=slicer[0]; i<=slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 4:
                for(int i=slicer[0]; i<=slicer[1]; i = i + slicer[2]) {
                    list.add(num_list[i]);
                }
                break;
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}