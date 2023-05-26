public class bai_139 {
    public static void main(String[] args) {

            int[] mangSoNguyen = {12, 7, 28, 9, 6};
            int viTriSoHoaThienCuoiCung = timViTriSoHoaThienCuoiCung(mangSoNguyen);

            if (viTriSoHoaThienCuoiCung != -1) {
                System.out.println("Vị trí số hoàn thiện cuối cùng trong mảng là: " + viTriSoHoaThienCuoiCung);
            } else {
                System.out.println("Mảng không có số hoàn thiện.");
            }
    }
    public static int timViTriSoHoaThienCuoiCung(int[] mang) {
        int viTriSoHoaThienCuoiCung = -1;

        for (int i = mang.length - 1; i >= 0; i--) {
            if (kiemTraSoHoaThien(mang[i])) {
                viTriSoHoaThienCuoiCung = i;
                break;
            }
        }

        return viTriSoHoaThienCuoiCung;
    }
    public static boolean kiemTraSoHoaThien(int n) {
        int tongUoc = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                tongUoc += i;
            }
        }

        return (tongUoc == n);
    }
    public static boolean soCuoiCung(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
