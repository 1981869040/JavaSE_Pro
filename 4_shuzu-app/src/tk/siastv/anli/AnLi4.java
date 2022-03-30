package tk.siastv.anli;

import java.util.Random;
import java.util.Scanner;

public class AnLi4 {
    public static void main(String[] args) {
        // 需求：键盘录入5名员工的工号，然后展示出一组随机的排名顺序 22 33 35 13 88
        int[] sz = new int[5];
        // 2、定义一个循环，循环5次，依次录入一个工号，存入对应位置
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < sz.length; i++) {
            // 正式录入工号
            System.out.println("请您输入第" + (i + 1) + "个员工的工号");
            int sr2 = sr.nextInt();
            // 存储到数组中
            sz[i] = sr2;
        }
        // 3、遍历数组中的每一个元素，然后随机出来一个索引，让该元素与随机索引位置处替换
        Random sj = new Random();
        for (int i = 0; i < sz.length; i++) {
            // 当前遍历的元素值 sz[i]
            // 随机出一个索引位置出来 sz[sjsy]
            int sjsy = sj.nextInt(sz.length);

            //定义一个临时变量存储sjsy位置处的值
            int sjsy2 = sz[sjsy];
            sz[sjsy] = sz[i];
            sz[i] = sjsy2;
        }
        // 4、遍历数组元素输出的就是随机排名的结果
        for (int i = 0; i < sz.length; i++) {
            System.out.print(sz[i] + "\t");
        }
    }
}
