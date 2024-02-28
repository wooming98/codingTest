class Solution {
    public String solution(String my_string, int m, int c) {
        String str = "";
        for(int i=c-1; i<my_string.length(); i+=m) {
            str += my_string.charAt(i);
        }
        return str;
    }
}