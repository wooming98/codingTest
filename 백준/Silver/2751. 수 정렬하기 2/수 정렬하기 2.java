import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for (Integer n : list) {
            sb.append(n).append("\n");
        }
        System.out.println(sb);
    }
}