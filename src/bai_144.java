public class bai_144 {
    public static void main(String[] args) {

        int[] number = {4, 6, 8, 9, 10, 11, 12, 13};
        int firstPrime = soNguyenToDauTien(number);
        if (firstPrime != -1) {
            System.out.println("Số nguyên tố đầu tiên trong mảng là: " + firstPrime);
        } else {
            System.out.println("Mảng không có số nguyên tố.");
        }
    }
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static int soNguyenToDauTien(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (isPrime(array[i])) {
                    return array[i];
                }
            }
            return -1; // Trả về -1 nếu không tìm thấy số nguyên tố
        }
}
//        int[] array = {4, 8, 7, 15, 9, 11};
//
//        int firstPrime = soNguyenToDauTien(array);
//        if (firstPrime != -1) {
//            System.out.println("Số nguyên tố đầu tiên trong mảng: " + firstPrime);
//        } else {
//            System.out.println("Mảng không có số nguyên tố.");
//        }
//    }
//
//    public static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static int soNguyenToDauTien(int[] array) {
//        for (int value : array) {
//            if (isPrime(value)) {
//                return value; // Trả về số nguyên tố đầu tiên tìm thấy
//            }
//        }
//
//        return -1; // Trả về -1 nếu không có số nguyên tố trong mảng
//    }
//}

