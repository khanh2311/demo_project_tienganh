import java.util.Scanner;

public class bai_128_130 {
    public static void main(String[] args) {
        int n = 5; // Số phần tử của mảng
        double[] array = new double[n];

        // Gọi hàm nhập mảng
        nhap(array);

        // In ra mảng sau khi nhập
        System.out.println("Mảng sau khi nhập:");
        xuat(array);
    }

    public static void nhap(double[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
    }

    public static void xuat(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
