class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++) {
            int rank = 1;
            for(int j : emergency) {
                if(emergency[i] < j) {
                    rank++;
                }
                answer[i] = rank;
            }
        }
        return answer;
    }
}