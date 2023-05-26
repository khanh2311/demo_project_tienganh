import java.util.Scanner;

public class bai_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        double  sum = 0;
        for (int i = 1; i <= n; i++) {
            double x = 1.0 /i ;
            sum += x;
        }

        System.out.println("Tổng của dãy số từ 1 đến n là: " + sum);

    }
}
