public class bai_127 {
    public static void main(String[] args) {

        double[] array = {5.4, 3.2, 1.8, 4.6, 2.9};

        // Sắp xếp mảng tăng dần
        sapXep(array);

        // In ra mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp tăng dần: ");
        for (double num : array) {
            System.out.print(num + " ");
        }
    }

    public static void sapXep(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Hoán đổi vị trí
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}