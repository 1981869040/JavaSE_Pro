package tk.siastv.demo;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 输入分数
        Scanner sr1 = new Scanner(System.in);

        int[] fs1 = new int[6];
        for (int i = 0; i < fs1.length; i++) {
            System.out.println("请输入第" + (i= i +1) + "个分数："); // i
            int sr2 = sr1.nextInt();
            fs1[i] = sr2;
        }
        int max = fs1[0];
        int min = fs1[0];
        int zf = 0;
        // 循环数组
        for (int i = 0; i < fs1.length; i++) {
            // 判断最大值
            if (fs1[i] > max) {
                max = fs1[i];
            }
            // 判断最小值
            if (fs1[i] < min) {
                min = fs1[i];
            }
            // 求和总分
            zf += fs1[i];
        }
        double pjf = (zf - max - min) * 1.0 / (fs1.length - 2);
        System.out.println("平均分为：" + pjf);
    }
}
