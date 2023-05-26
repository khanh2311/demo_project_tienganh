public class bai1_128_130 {
    public static void main(String[] args) {
            double[] array = {1.5, 2.8, 3.7, 4.2, 5.9};

            // In ra mảng
            System.out.println("Mảng:");
            xuat(array);
        }

        public static void xuat(double[] array) {
            for (double num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

