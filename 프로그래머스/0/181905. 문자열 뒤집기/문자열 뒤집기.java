class Solution {
    public String solution(String my_string, int s, int e) {
        String str = "";
        for(int i=e; i>=s; i--) {
            str += my_string.charAt(i);
        }
        return my_string.replace(my_string.substring(s, e+1), str);
    }
}