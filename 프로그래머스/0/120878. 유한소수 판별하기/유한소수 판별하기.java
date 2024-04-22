import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int num1 = a;
        int num2 = b;
        
        while(num1 != 0) {
            int temp = num1;
            num1 = num2 % num1;
            num2 = temp;
        }
        b /= num2;
        
        List<Integer> list = new ArrayList<>();
        
        int x = 2;
        while(b != 1) {
            if(b % x == 0) {
                list.add(x);
                b /= x;
            } else {
                x++;
            }
        }
    
        for(Integer i : list) {
            if(i != 2 && i != 5) {
                return 2;
            }
        }
        return 1;
    }
}