public class bai_138 {
    public static void main(String[] args) {

        int[] mangSoNguyen = {3, 7, 9, 5, 2, 8};

        int viTriGiaTriChanDauTien = timViTriGiaTriChanDauTien(mangSoNguyen);

        if (viTriGiaTriChanDauTien != -1) {
            System.out.println("Vị trí của giá trị chẵn đầu tiên trong mảng là: " + viTriGiaTriChanDauTien);
        } else {
            System.out.println("Mảng không có giá trị chẵn.");
        }
    }

    public static int timViTriGiaTriChanDauTien(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                return i;
            }
        }

        return -1;
    }
}