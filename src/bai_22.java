import java.util.Scanner;

public class bai_22 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhâập số nguyene dương n ");
        int n = scanner.nextInt();
        int product = 1; // tích ước số
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                product *= i;
            }
        }
        System.out.println("tổng các số nguyên là:"+ product);
    }
    }

