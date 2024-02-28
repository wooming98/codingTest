class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i=0; i< count; i++) {
            answer += price + (price * i);
        }
        return answer <= money ? 0 : answer - money;
    }
}