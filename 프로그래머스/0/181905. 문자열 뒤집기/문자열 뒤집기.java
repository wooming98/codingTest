class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s, e+1);
        String str = "";
        for(int i=answer.length()-1; i>=0; i--) {
            str += answer.charAt(i);
        }
        my_string = my_string.replace(my_string.substring(s, e+1), str);
        return my_string;
    }
}