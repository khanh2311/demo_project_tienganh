public class bai_136 {
    public static void main(String[] args) {

            int[] mangSoNguyen = {3, 7, 9, 5, 2, 8};

            int soChanCuoiCung = timSoChanCuoiCung(mangSoNguyen);

            if (soChanCuoiCung != -1) {
                System.out.println("Số chẵn cuối cùng trong mảng là: " + soChanCuoiCung);
            } else {
                System.out.println("Mảng không có số chẵn.");
            }
        }
        public static int timSoChanCuoiCung(int[] mang) {
            for (int i = mang.length - 1; i >= 0; i--) {
                if (mang[i] % 2 == 0) {
                    return mang[i];
                }
            }

            return -1;
        }
    }