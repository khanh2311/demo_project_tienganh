public class bai_134 {
    public static void main(String[] args) {
        double[] array = {2.5, 7.8, 1.2, 6.4, 9.7, 3.1};

        double maxValue = lonNhat(array);
        System.out.println("Giá trị lớn nhất trong mảng: " + maxValue);
    }

    public static double lonNhat(double[] array) {
        double maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
