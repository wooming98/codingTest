class Solution {
    public int solution(String t, String p) {
        int n = 0;
        String str = "";
        for(int i=0; i<t.length()-p.length()+1 ; i++) {
            str = t.substring(i, p.length() + i);
            if(Long.parseLong(str) <= Long.parseLong(p)) {
                n++;
            }
        }
        return n;
    }
}