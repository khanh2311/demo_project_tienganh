import java.util.Scanner;

public class bai_19 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập giá trị của x: ");
                double x = scanner.nextDouble();
                System.out.print("Nhập giá trị của n: ");
                int n = scanner.nextInt();

                double sum = 1.0;
                double term = 1.0;
                int denominator = 1;

                for (int i = 1; i <= n; i++) {
                    denominator *= (2 * i) * (2 * i + 1);  // Tính giai thừa của (2n+1)
                    term *= x;  // Tính x^i

                    sum += term / denominator;  // Cộng vào tổng
                }

                System.out.println("Giá trị của S(n) là: " + sum);
            }
        }

