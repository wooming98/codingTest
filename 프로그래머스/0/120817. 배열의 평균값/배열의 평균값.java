class Solution {
    public double solution(int[] numbers) {
        double result = 0;
        for(int i : numbers) {
            result += i;
        }
        return result/numbers.length;
    }
}