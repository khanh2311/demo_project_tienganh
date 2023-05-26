public class bai_140 {
    public static void main(String[] args) {

            double[] mangSoThuc = {-3.2, 0, 5.4, -1.8, 2.9};
            double giaTriDuongNhoNhat = timGiaTriDuongNhoNhat(mangSoThuc);

            if (giaTriDuongNhoNhat != -1) {
                System.out.println("Giá trị dương nhỏ nhất trong mảng là: " + giaTriDuongNhoNhat);
            } else {
                System.out.println("Mảng không có giá trị dương.");
            }
    }
        public static double timGiaTriDuongNhoNhat(double[] mang) {
            double giaTriDuongNhoNhat = -1; // Giá trị khởi tạo mặc định

            for (int i = 0; i < mang.length; i++) {
                if (mang[i] > 0) {
                    if (giaTriDuongNhoNhat == -1 || mang[i] < giaTriDuongNhoNhat) {
                        giaTriDuongNhoNhat = mang[i];
                    }
                }
            }
            return giaTriDuongNhoNhat;
        }
    }