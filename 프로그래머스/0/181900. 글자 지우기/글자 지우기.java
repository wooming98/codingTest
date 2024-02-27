class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i : indices) {
            arr[i] = "";
        }
        for(int i=0; i<arr.length; i++) {
            if(!arr[i].isEmpty()) {
                answer += arr[i];
            }
        }
        return answer;
    }
}