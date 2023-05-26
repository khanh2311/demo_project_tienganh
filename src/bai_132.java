public class bai_132 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Các giá trị chẵn trong mảng:");
        lietKe(array);
    }

    public static void lietKe(int[] array) {
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
