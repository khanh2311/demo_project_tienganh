public class bai_137 {
    public static void main(String[] args) {
        double[] array = {5.6, 3.2, 7.1, 2.8, 9.4, 1.7};

        int minIndex = nhỏNhat(array);
        System.out.println("Vị trí giá trị nhỏ nhất trong mảng: " + minIndex);
    }

    public static int nhỏNhat(double[] array) {
        if (array.length == 0) {
            return -1; // Trường hợp mảng rỗng
        }

        int minIndex = 0; // Giả sử giá trị nhỏ nhất là phần tử đầu tiên
        double minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
