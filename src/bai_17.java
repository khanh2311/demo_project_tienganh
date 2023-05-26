import java.util.Scanner;

public class bai_17 {
    public static void main(String[] args) {
        System.out.println(" vui lòng nhập x;");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("vui lòng nhập n");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double term = Math.pow(x, i) / fantorial(i);
            sum += term;
        }
        System.out.println(" kết quả là:" + sum);
    }
    public static double fantorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *=i;
        }
         return result;
        }
}