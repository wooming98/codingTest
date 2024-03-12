class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String str = "";
        for(int i=0; i<my_string.length(); i++) {
            if(i>=s && i<overwrite_string.length()+s) {
                str += overwrite_string.charAt(i-s);
            } else {
                str += my_string.charAt(i);
            }
        }
        return str;
    }
}