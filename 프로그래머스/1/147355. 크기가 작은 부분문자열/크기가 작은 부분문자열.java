class Solution {
    public int solution(String t, String p) {
        int size = t.length() - p.length() + 1;
        String[] arr = new String[size];
        for(int i=0; i<size; i++) {
            arr[i] = t.substring(i, p.length() + i);
        }
        int n = 0;
        for(String s : arr) {
            if(Long.parseLong(s) <= Long.parseLong(p)) {
                n++;
            }
        }
        return n;
    }
}