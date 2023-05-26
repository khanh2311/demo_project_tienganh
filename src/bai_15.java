import java.util.Scanner;

public class bai_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("vui lòng nhập số nguyên:");
        int n = scanner.nextInt();
        double sum = 0;

        for(int i = 1 ; i <= n ;i++){
            int denominator = i *(i+1)/2 ;
            double term = 1.0/ denominator;
            sum += term;
        }
        System.out.println("kết quả là:"+sum);
    }
}
