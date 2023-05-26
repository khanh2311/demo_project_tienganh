public class bai_141 {
    public static void main(String[] args) {
        int [] mang = {6,9,8,4,2,11,24};
        int viTriGiaTriDuongNhoNhat = timViTriGiaTriDuongNhoNhat(mang);

        if (viTriGiaTriDuongNhoNhat != -1) {
            System.out.println("Vị trí giá trị dương nhỏ nhất trong mảng là: " + viTriGiaTriDuongNhoNhat);
        } else {
            System.out.println("Mảng không có giá trị dương.");
        }
    }

    public static int timViTriGiaTriDuongNhoNhat(int[] mang) {
        int viTriGiaTriDuongNhoNhat = -1;
        double giaTriDuongNhoNhat = Double.MAX_VALUE;

        for (int i = 0; i < mang.length; i++) {
            if (mang[i] > 0 && mang[i] < giaTriDuongNhoNhat) {
                giaTriDuongNhoNhat = mang[i];
                viTriGiaTriDuongNhoNhat = i;
            }
        }

        return viTriGiaTriDuongNhoNhat;
    }
}