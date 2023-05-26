public class bai_122 {
    public static void main(String[] args) {

        double[] array = {2.5, 4.8, 1.3, 6.9, 3.7};

        double maxValue = findMaxValue(array);
        System.out.println("Giá trị lớn nhất trong mảng là: " + maxValue);
    }

    public static double findMaxValue(double[] array) {
        if (array.length == 0) {
            System.out.println("Mảng không được rỗng.");
            return 0 ;
        }

        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

}
