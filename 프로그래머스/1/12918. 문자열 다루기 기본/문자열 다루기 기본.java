class Solution {
    public boolean solution(String s) {
        boolean answer = s.matches("\\d+");
        return (answer == true) && (s.length() == 4 || s.length() == 6) ? true : false;
    }
}