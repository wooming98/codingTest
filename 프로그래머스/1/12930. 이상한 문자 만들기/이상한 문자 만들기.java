class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        boolean tf = true;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                tf = true;
            } else {
                if (tf) {
                    chars[i] = Character.toUpperCase(chars[i]);
                } else {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
                tf = !tf;
            }
        }
        return new String(chars);
    }
}