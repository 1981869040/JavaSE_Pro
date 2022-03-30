package tk.siastv.anli;

public class AnLi2 {
    public static void main(String[] args) {
        // 需求：数组元素求最值
        // 1、定义一个静态初始化的数组，存储一批颜值
        int[] a1 = {15, 9000, 10000, 20000, 9500, -5};
        // 2、定义一个变量用于存储最大值元素，建议使用第一个数组元素作为参照
        int a2 = a1[0];
        //3、遍历数组的每个元素，依次与最大值变量的数据比较，若较大，则替换
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] > a2) {
                a2 = a1[i];
            }
        }
        //4、输出最大值变量存储的数据即可
        System.out.println("数组的最大值是：" + a2);
    }
}
