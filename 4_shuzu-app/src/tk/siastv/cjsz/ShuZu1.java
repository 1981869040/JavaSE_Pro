package tk.siastv.cjsz;

public class ShuZu1 {
    public static void main(String[] args) {
        // 目标：学会使用静态初始化的方式定义数组
        // 数据类型[] 数组名称 = new 数据类型[]{元素1，元素2...}；
//         double[] a = new double[]{元素1，元素2...};
//        double[] a = new double[]{99.0, 200, 300};
//        int[] b = new int[]{100, 200, 300};
//        String[] c = new String[]{"数组1", "数组2", "数组3"};

        // 简化版本
        // 数据类型[] 数组名称 = {元素1，元素2...};
        double[] a1 = {100.0, 200.1, 300.3};
        int[] b1 = {100,200,300};
        String[] c1 = {"数组1","数组2","数组3"};

        System.out.println(a1);
        System.out.println(c1[1]);
        c1[2] = "元素";
        System.out.println(c1[2]);
    }
}
