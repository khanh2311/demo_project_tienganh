public class bai_125 {
    public static void main(String[] args) {
        int[] array = {2,4,6,7,9,11};
        int count = soNguyenToNhoHon100(array);
        System.out.println("Số lượng số nguyên tố nhỏ hơn 100 trong mảng là: " + count);

    }

        public static boolean isPrime ( int number){
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
        public static int soNguyenToNhoHon100( int[] array){
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (isPrime(array[i]) && array[i] < 100) {
                    count++;
                }
            }
            return count;
        }
    }