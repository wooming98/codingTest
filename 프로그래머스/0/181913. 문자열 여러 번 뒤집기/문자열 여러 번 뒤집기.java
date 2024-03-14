class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i=0; i<queries.length; i++) {
            String temp = "";
            String start = my_string.substring(0, queries[i][0]);
            String end = my_string.substring(queries[i][1]+1);
            for(int j=queries[i][1]; j>=queries[i][0]; j--) {
                temp += my_string.charAt(j);
            }
            my_string = start + temp + end;
        }
        return my_string;
    }
}