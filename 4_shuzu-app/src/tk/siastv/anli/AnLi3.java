package tk.siastv.anli;

import java.util.Random;
import java.util.Scanner;

public class AnLi3 {
    public static void main(String[] args) {
        // 需求：随机生成 1 - 20 之间的5个数（无所谓是否重复），然后让大家来猜数字
        // 猜中提示，并输出该数据第一次出现的位置，切输出全部5个数据，然后结束游戏

        // 1、定义一个动态初始化数组存储5个1-20之间随机的数据
        int[] sz = new int[5];

        Random sj = new Random();
        // 2、动态生成5个1-20之间的5个数，并存储到数组中
        for (int i = 0; i < sz.length; i++) {
            sz[i] = sj.nextInt(1, 21);
        }

        // 3、创建一个死循环，让用户进行猜测
        Scanner sr = new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("请您输入1-20之间的整数进行猜测：");
            int sr2 = sr.nextInt();
            // 4、遍历数组中的每个数据，看是否有数据与猜测的数据相同，相同则代表猜中，给出提示
            for (int i = 0; i < sz.length; i++) {
                if (sr2 == sz[i]){
                    System.out.println("恭喜您输入正确，您猜中的数据为：" + sr2);
                    break OUT;
                }
            }
            System.out.println("您输入错误，请重新输入");
        }
        // 5、输出数组的全部元素，让用户看到自己确实是猜中了某个数据
        for (int i = 0; i < sz.length; i++) {
            System.out.print(sz[i] + "\t");
        }
    }
}
