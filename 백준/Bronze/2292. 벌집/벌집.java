import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
        }
        int count = 1;
        int end = 1;
        int start = 2;
        while (n != 1) {
            end += count * 6;
            count++;
            if (start <= n && end >= n) {
                System.out.println(count);
                break;
            } else {
                start = 2 + ((count - 1) * 6);
            }
        }
    }
}