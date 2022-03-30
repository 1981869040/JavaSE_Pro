package tk.siastv.cjsz;

public class ShuZu3 {
    public static void main(String[] args) {
        // 目标：理解数组的注意事项
        // 1、数据类型[] 数组名称 = {}; 也可以写成 数据类型 数组名称[] = {};
        // int a1[] = {};
        int[] a = {};

        // 2、什么类型的数组只能存放什么类型的元素
        // String[] a2 = {"元素1","元素2",20} //报错

        //3、数组一旦定义出来，数组长度和类型就固定了
        int[] a3 = {10,20,30};
        System.out.println(a3[3]);
    }
}
