public class bai_133 {
    public static void main(String[] args) {

            double[] array = {-1.5, 2.0, -3.7, 4.2, -5.9, 6.8, -7.3};

            System.out.println("Các vị trí có giá trị âm trong mảng:");
            lietKeGiaTriAm(array);
        }

        public static void lietKeGiaTriAm (double[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    System.out.println("Vị trí " + i + ": " + array[i]);
                }
            }
        }
    }