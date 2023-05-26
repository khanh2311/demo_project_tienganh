import java.util.Scanner;

public class bai_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Các ước số lẻ của " + n + " là:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}