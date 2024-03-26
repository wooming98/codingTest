class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // true인 학생 중 rank가 높은 순으로 인덱스를 배열에 넣기
        int arr[] = new int[3];
        int n = 0;
        int idx = 1;
        while(n != 3) {
            for(int i=0; i<attendance.length; i++) {
                if(attendance[i] && idx == rank[i]) {
                    arr[n++] = i;
                }
            }
            idx++;
        }
        return arr[0]*10000 + arr[1]*100 + arr[2];
    }
}