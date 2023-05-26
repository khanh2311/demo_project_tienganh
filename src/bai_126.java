public class bai_126 {
    public static void main(String[] args) {

        double[] array = {1.5, -2.0, 3.7, -4.2, 5.9, -6.4};
        double sum =  giatriam(array);
        System.out.println("Tổng các giá trị âm trong mảng là: " + sum);
    }
        public static double giatriam(double[] array) {
            double sum = 0.0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    sum += array[i];
                }
            }
            return sum ;
    }
}
