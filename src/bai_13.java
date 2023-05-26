import java.util.Scanner;

public class bai_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị x: ");
        int x = scanner.nextInt();
        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            int power = (int) Math.pow(x, 2 * i);
            sum += power;

        }

        System.out.println("Tổng S(n) = " + sum);
    }
}
