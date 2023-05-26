import java.util.Scanner;

public class bai_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số x: ");
        int x = scanner.nextInt();
        System.out.println("nhập số n: ");
        int n = scanner.nextInt();

        int sum = 0 ;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println("Tổng của dãy số từ 1 đến n là: " + sum);
    }
}
