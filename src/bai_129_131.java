import java.util.Scanner;

public class bai_129_131 {
    public static void main(String[] args) {
        int n = 5; // Số phần tử của mảng
        int[] array = new int[n];

        // Gọi hàm nhập mảng
        nhap(array);

        // In ra mảng sau khi nhập
        System.out.println("Mảng sau khi nhập:");
        xuat(array);
    }

    public static void nhap(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public static void xuat(int[] array) {
        System.out.println("Mảng:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
