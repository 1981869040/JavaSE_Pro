package tk.siastv.demo;

public class AnLi3 {
    public static void main(String[] args) {
        // 需求：使用方法，找出任意整型数组最大的值并返回
        int[] zdz = {10, 20, 30, 40};
        int[] zdz1 = {1, 2, 3, 4};
        int max = zdz(zdz);
        System.out.println("最大值为：" + max);
        int max1 = zdz(zdz1);
        System.out.println("最大值为：" + max1);
//        for (int i = 0; i < zdz.length; i++) {
//            // i = 0 < zdz 0
//            // i = 1 < zdz 1
//            // i = 2 < zdz 2
//            // i = 3 < zdz 3
//            // i = 4 < zdz //no
//            System.out.println(i);
//            System.out.println(zdz[i]);
//
//        }
    }

    public static int zdz(int[] zdz1) {
        int zdz2 = zdz1[0];
        for (int i = 0; i < zdz1.length; i++) {
            // i = 0 < zd1 1
            // i = 1 < zd1 2
            // i = 2 < zd1 3
            // i = 3 < zd1
            if (zdz2 < zdz1[i]) {
                zdz2 = zdz1[i];
            }
        }
        return zdz2;
    }
}
