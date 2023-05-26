public class bai_142 {
    public static void main(String[] args) {

            double[] numbers = {5.4, 2.9, 10.1, 3.7, 7.2};
            double minValue = giaTriNhoNhat(numbers);

            System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
        public static double giaTriNhoNhat(double[] array) {
            if (array.length == 0) {
                System.out.println("Mảng không được rỗng.");
                return 0 ;
            }
            double minValue = array[0]; // Giả sử phần tử đầu tiên là giá trị nhỏ nhất

            for (int i = 1; i < array.length; i++) {
                if (array[i] < minValue) {
                    minValue = array[i];
                }
            }
            return minValue;
        }
    }