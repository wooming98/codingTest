class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] array = number.split("");
        for(int i=0; i<array.length; i++) {
            answer += Integer.parseInt(array[i]);
        }
        return answer%9;
    }
}