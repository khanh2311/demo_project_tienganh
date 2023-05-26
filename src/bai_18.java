import java.util.Scanner;

public class bai_18 {
    public static void main(String[] args) {

        System.out.println(" vui lòng nhập x;");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("vui lòng nhập n");
        int n = scanner.nextInt();

        double sum = 1;
        for (int i = 1; i <= n; i++) {
            double term = Math.pow(x, 2 * i) / fantorial(2 * i);
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
