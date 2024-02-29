class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] arr;
        for(int i=0; i<answer.length; i++) {
            arr = quiz[i].split(" ");
            if(arr[1].equals("+")) {
                if(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if(Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}