package tk.siastv.canshu;

public class AnLi5 {
    public static void main(String[] args) {
        // 需求：比较任意2个整型数组的内容是否一样，一样返回true 反之false
        // 2、定义数组
        int[] sz = {10, 20, 30, 40};
        int[] sz2 = {10, 20, 30, 40};
        System.out.println(ff1(sz, sz2));

    }

    // 1、定义一个方法：参数：接收2个整型数组，返回值类型：布尔类型
    public static boolean ff1(int[] ffsz1, int[] ffsz2) {
        if (ffsz1.length == ffsz2.length) {
            for (int i = 0; i < ffsz1.length; i++) {
                if (ffsz1[i] != ffsz2[i]) {
                    return false;  // 不一样
                }
            }
            return true;  // 一样
        } else {
            return false;
        }
    }
}
