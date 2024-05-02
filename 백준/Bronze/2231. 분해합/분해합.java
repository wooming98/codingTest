import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = n; i > 0; i--) {
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            sum += i;
            if (n == sum) {
                list.add(i);
            }
        }
        if (list.size() > 0) {
            Collections.sort(list);
            System.out.println(list.get(0));
        } else {
            System.out.println(0);
        }
    }
}