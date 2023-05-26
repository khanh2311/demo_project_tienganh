public class bai_143 {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        int firstEven = soChanDauTien(numbers);

        if (firstEven != -1) {
            System.out.println("Số chẵn đầu tiên trong mảng là: " + firstEven);
        } else {
            System.out.println("Mảng không có số chẵn.");
        }
    }

        public static int soChanDauTien(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    return array[i];
                }
            }

            return -1; // Trả về -1 nếu không tìm thấy số chẵn
        }
    }
