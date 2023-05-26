import java.util.Scanner;

public class bai_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        double sum = 1;
        for (int i = 1; i <= n; i++) {

            sum *= i  ;
        }

        System.out.println("Tổng của dãy số từ 1 đến "+n+" là " + sum);

    }
}
