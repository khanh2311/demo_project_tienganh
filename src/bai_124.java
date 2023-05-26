public class bai_124 {
    public static void main(String[] args) {

            int[] mangSoNguyen = {1500, 2010, 500, 2500, 1000};

            boolean tonTaiGiaTriChanNhoHon2004 = kiemTraGiaTriChanNhoHon2004(mangSoNguyen);

            if (tonTaiGiaTriChanNhoHon2004) {
                System.out.println("Trong mảng có tồn tại giá trị chẵn nhỏ hơn 2004.");
            } else {
                System.out.println("Trong mảng không có giá trị chẵn nhỏ hơn 2004.");
            }
        }
        public static boolean kiemTraGiaTriChanNhoHon2004(int[] mang) {
            for (int num : mang) {
                if (num % 2 == 0 && num < 2004) {
                    return true;
                }
            }
            return false;
        }
    }