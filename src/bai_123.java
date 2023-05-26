public class bai_123 {
    public static void main(String[] args) {
        int [] arry = {2,4,6,8,12,14,23,45};
        int min =finMinValue(arry);
        System.out.println("Giá trị nhỏ nhất là:"+min);


    }
    public static int finMinValue( int [] arry) {
        if (arry.length == 0) {
            System.out.println("mảng không hợp lệ");
            return 0;
        }
        int min = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] < min) {
                min = arry[i];
            }
        }
        return min ;
    }
}
