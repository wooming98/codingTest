class Solution {
    public int solution(String s) {
        String[] array = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<array.length; i++) {
            s = s.replace(array[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}