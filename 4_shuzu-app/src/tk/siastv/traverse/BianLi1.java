package tk.siastv.traverse;

public class BianLi1 {
    public static void main(String[] args) {
        // 目标：学会进行数组元素的遍历
        int[] a1 = {10, 20, 20, 30, 40};

        // 原始遍历方式
//        int b1 = 20;
//        System.out.println(a1[0]);
//        System.out.println(a1[1]);
//        System.out.println(a1[2]);
//        System.out.println(a1[3]);
//        System.out.println(a1[4]);

        for (int a3 = 0; a3 <= 4; a3++) {
            System.out.println(a1[a3]);
        }
        System.out.println("--------------");

        // 自己编写的写法 过于重复
        int a4 = a1.length;
        System.out.println(a4);
        for (int a5 = 0; a5 < a4; a5++) {
            System.out.println(a1[a5]);
        }
        // 通用简便方法
        System.out.println("--------------");
        for (int a6 = 0; a6 < a1.length; a6++) {
            System.out.println(a1[a6]);
        }

        System.out.println("--------------");
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);

        }
    }
}
