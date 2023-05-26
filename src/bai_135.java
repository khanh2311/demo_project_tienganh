public class bai_135 {
    public static void main(String[] args) {

            double[] mangSoThuc = {-3.2, 0, 5.4, -1.8, 2.9};

            double giaTriDuongDauTien = timGiaTriDuongDauTien(mangSoThuc);

            if (giaTriDuongDauTien != -1) {
                System.out.println("Giá trị dương đầu tiên trong mảng là: " + giaTriDuongDauTien);
            } else {
                System.out.println("Mảng không có giá trị dương.");
            }
        }
        public static double timGiaTriDuongDauTien(double[] mang) {
            for (double num : mang) {
                if (num > 0) {
                    return num;
                }
            }
            return -1;
        }
    }