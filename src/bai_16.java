import java.util.Scanner;

public class bai_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" vui lòng nhập số nguyên x:");
        int x = scanner.nextInt();
        System.out.println(" vui lòng nhập n;");
        int n = scanner.nextInt();

        double sum = 0 ;
        for (int i = 1; i <= n; i++){
            double denominater = (i*(i + 1 ))/2;
            double term = Math.pow(x, i)/ denominater;
            sum += term;

        }
        System.out.println(" kết quả là:"+sum );
    }
}
