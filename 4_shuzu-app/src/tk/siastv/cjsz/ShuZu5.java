package tk.siastv.cjsz;

public class ShuZu5 {
    public static void main(String[] args) {
        // 目标：掌握动态初始化元素默认值的规则
        // 1、整数数组的默认值都为 0
        int[] a1 = new int[100];
        System.out.println(a1[0]);
        System.out.println(a1[99]);

        // 2、字符数组的默认值是多少呢？ 0
        char[] a2 = new char[100];
        System.out.println((int)a2[0]);
        System.out.println((int)a2[99]);

        // 3、浮点型数组的默认值都为 0.0
        double[] a3 = new double[100];
        System.out.println(a3[0]);
        System.out.println(a3[99]);

        //4、布尔类型的数组的默认值都为 false
        boolean[] a4 = new boolean[100];
        System.out.println(a4[0]);
        System.out.println(a4[99]);

        //5、引用类型数组的默认值都为 null
        String[] a5 = new String[100];
        System.out.println(a5[0]);
        System.out.println(a5[99]);
    }
}
