import java.util.*;

public class Tables {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i * num);
        }
    }
}
