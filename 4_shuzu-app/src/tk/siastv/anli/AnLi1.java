package tk.siastv.anli;

public class AnLi1 {
    public static void main(String[] args) {
        // 需求：数组元素求和
        // 1、建立数组并放入数据
        int[] a1 = {16,26,36,6,100};

        //3、定义一个求和变量累加数组的元素值
        int a2 = 0;

        // 2、遍历数组
        for (int i = 0; i < a1.length; i++) {
            a2 += a1[i];
        }
        System.out.println("数组元素的和为：" + a2);
    }
}
