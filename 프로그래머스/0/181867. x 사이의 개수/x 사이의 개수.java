class Solution {
    public int[] solution(String myString) {
        int n = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'x') {
                n++;
            }
        }
        int[] answer = new int[n+1];
        
        n = 0;
        int idx = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'x') {
                answer[idx++] = n;
                n = 0;
            } else {
                n++;
            }
        }
        answer[idx] = n;
        return answer;
    }
}