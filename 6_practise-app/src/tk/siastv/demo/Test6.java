package tk.siastv.demo;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        // 需求：数据加密
        // 1、定义一个数组存入需要加密的数据
        Scanner sr1 = new Scanner(System.in);
        System.out.println("请您输入加密数据的数字个数：");
        int sr2 = sr1.nextInt();
        int[] sz1 = new int[sr2];
        // 2、录入需要加密的数字
        for (int i = 0; i < sz1.length; i++) {
            System.out.println("请你输入需要加密的第" + (i + 1) + "数字：");
            int sr3 = sr1.nextInt();
            sz1[i] = sr3;
        }
        // 3、打印数组看一下
        bl1(sz1);

        for (int i = 0; i < sz1.length; i++) {
            sz1[i] = (sz1[i] + 5) % 10;
        }

        for (int i = 0, j = sz1.length - 1; i < j; i++, j--) {
            int fz1 = sz1[i];
            sz1[i] = sz1[j];
            sz1[j] = fz1;
        }
        bl1(sz1);
    }

    public static void bl1(int[] bl2) {
        System.out.print("数字是：[");
        for (int i = 0; i < bl2.length; i++) {
            System.out.print(i == bl2.length - 1 ? bl2[i] : bl2[i] + "，");
        }
        System.out.print("]");
    }
}
