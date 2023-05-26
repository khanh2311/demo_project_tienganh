import java.util.Scanner;

public class bai_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhâập số nguyene dương n ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("tổng các số nguyên là:"+sum);
    }
    }

