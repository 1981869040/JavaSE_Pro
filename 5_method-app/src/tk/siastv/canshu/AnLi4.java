package tk.siastv.canshu;

import java.util.Scanner;

public class AnLi4 {
    public static void main(String[] args) {
        // 需求：从整形数组中查询某个数据的索引返回，不存在该数据返回-1
        // 从键盘开始录入数据
        System.out.println("请输入您查询的整数：");
        Scanner jp = new Scanner(System.in);
        int sr1 = jp.nextInt();

        // 3、定义数组，调用方法
        int[] sz1 = {10, 20, 30, 40};
        int sc = ff1(sz1, sr1);
        System.out.println("您查询整数的索引是：" + sc);
    }
    // 1、定义一个方法：参数接收数组，要查询的数据，返回值：整型
    public static int ff1(int[] ffsz1, int sr) {
        // 2、开始找出这个数组的索引
        for (int i = 0; i < ffsz1.length; i++) {
            if (sr == ffsz1[i]) {
                return i;
            }
        }
        return -1;  // 查无此元素
    }
}