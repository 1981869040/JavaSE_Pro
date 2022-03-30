package tk.siastv.cjsz;

public class ShuZu2 {
    public static void main(String[] args) {
        // 目标：学会访问数组的元素
        int[] a = {10, 20, 30, 40};
        System.out.println(a);

        // 取值 数组名称[索引]
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        // 赋值 数组名称[索引] = 值;
        a[2] = 2;
        System.out.println(a[2]);

        //访问数组的长度
        System.out.println(a.length);

        //数组的最大索引可以怎么表示 ：数组名.length - 1 // 前提：元素个数大于1 数组索引从 0 开始
        int b = a.length - 1;
        System.out.println(b);
    }
}
