class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        String str = "";
        for(int i=0; i<flag.length; i++) {
            if(flag[i] == true) {
                str += (arr[i] + "").repeat(arr[i] * 2);
            } else {
                str = str.substring(0, str.length() - arr[i]);
            }
        }
        int[] answer = new int[str.length()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = str.charAt(i) - 48;
        }
        return answer;
    }
}