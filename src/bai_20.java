import java.util.Scanner;

public class bai_20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào số n: ");
        int n = scanner.nextInt();
        System.out.println(" các ước số của"+n+"là");
        for (int i = 1; i <= n; i++){
            if(n % i == 0) {
                System.out.println("đây là số nguyên dương" + i);
            }
        }
    }
}
