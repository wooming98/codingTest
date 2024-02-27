class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] array = new int[included.length];
        int n = 0;
        for(int i=0; i<array.length; i++) {
            array[i] = a + n;
            n += d;
        }
        n = 0;
        for(int i=0; i<array.length; i++) {
            if(included[i] == true) {
                n += array[i];
            }   
        }
        return n;
    }
}