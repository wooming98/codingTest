class Solution {
    public String solution(String s) {
        String str = "";
        if(s.length()%2 == 0) {
            str = s.substring(s.length()/2-1, s.length()/2+1);
        } else {
            str = s.charAt(s.length()/2) + "";
        }
        return str;
    }
}