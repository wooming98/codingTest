class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int n = arr.length;
        int k = arr[0].length;
        if(n > k) {
            answer = new int[n][n];
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        } else {
            answer = new int[k][k];
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        return answer;
    }
}