package tk.siastv.cjsz;

public class Shuzu4 {
    public static void main(String[] args) {
        // 目标：学会动态化初始数组的定义和使用
        int[] a = new int[3]; // [0,0,0]
        int a1 = a.length - 1; // 数组最大索引
        System.out.println(a1);
        System.out.println("----------------");
        // 赋值
        a[1] = 20;
        System.out.print(a[0]);
        System.out.print(" "); // 不换行 空格
        System.out.print(a[1]);
        System.out.print(" "); // 不换行 空格
        System.out.println(a[2]);
        System.out.println("-----------------");

        String[] b = new String[3];
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        b[1] = "元素";
        System.out.println(b[1]);
    }
}
