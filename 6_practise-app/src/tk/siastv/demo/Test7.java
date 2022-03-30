package tk.siastv.demo;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        // 需求 双色球系统
//        bl1(suijihaoma1());
        int[] suijihaoma3 = suijihaoma1();
        int[] shuruhaoma3 = shuruhaoma1();
        shuchu(shuruhaoma3, suijihaoma3);
    }

    // 随机出双色球号码
    public static int[] suijihaoma1() {
        // 定义一个初始化动态数组
        int[] cjsz1 = new int[7];
        Random suijihaoma2 = new Random();
        for (int i = 0; i < cjsz1.length - 1; i++) {
            // 创建死循环
            while (true) {
                // 随机生成号码
                int suijihaoma3 = suijihaoma2.nextInt(33) + 1;
                boolean flag = true;
                // 循环查询生成的号码是否重复 重复则跳出重新循环生成
                for (int j = 0; j < i; j++) {
                    if (cjsz1[j] == suijihaoma3) {
                        flag = false;
                        break;
                    }
                }
                // 将生成的号码导入数组
                if (flag) {
                    cjsz1[i] = suijihaoma3;
                    break;
                }
            }
        }
        // 生成第七位的随机数
        cjsz1[cjsz1.length - 1] = suijihaoma2.nextInt(16) + 1;
        return cjsz1;
    }

    // 用户输入号码
    public static int[] shuruhaoma1() {
        Scanner sr1 = new Scanner(System.in);
        int[] shuruhaoma2 = new int[7];
        for (int i = 0; i < shuruhaoma2.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个号码：（1 - 33 不重复)");
            int shuruhaoma3 = sr1.nextInt();
            shuruhaoma2[i] = shuruhaoma3;
        }
        return shuruhaoma2;
    }


    // 判断是否中奖
    public static void shuchu(int[] shuruhaoma2, int[] suijihaoma2) {
        int shuruhaoma3 = 0;
        int suijihaoma3 = 0;
        // 判断中了几个红球
        for (int i = 0; i < shuruhaoma2.length - 1; i++) {
            for (int j = 0; j < suijihaoma2.length - 1; j++) {
                if (shuruhaoma2[i] == suijihaoma2[j]) {
                    shuruhaoma3++;
                    break;
                }
            }
        }


// 判断第七位数是否中奖
        suijihaoma3 = shuruhaoma2[shuruhaoma2.length - 1] == suijihaoma2[suijihaoma2.length - 1] ? 1 : 0;


        System.out.print("中奖号码是：");
        bl1(suijihaoma2);
        System.out.println();
        System.out.print("您输入的号码是：");
        bl1(shuruhaoma2);
        System.out.println();
        System.out.println("您是否命中篮球：" + (suijihaoma3 == 1 ? "是" : "否"));

        if (suijihaoma3 == 1 || shuruhaoma3 == 1 && shuruhaoma3 < 2) {
            System.out.println("恭喜您中了5元");
        } else if (suijihaoma3 == 1 && shuruhaoma3 == 3 || suijihaoma3 == 0 && shuruhaoma3 == 4) {
            System.out.println("恭喜您中了10元");
        } else if (suijihaoma3 == 0 && shuruhaoma3 == 5) {
            System.out.println("恭喜您中了200元");
        } else if (suijihaoma3 == 1 && shuruhaoma3 == 5) {
            System.out.println("恭喜您中了300元");
        } else if (suijihaoma3 == 0 && shuruhaoma3 == 6) {
            System.out.println("恭喜您中了500万元");
        } else if (suijihaoma3 == 1 && shuruhaoma3 == 6) {
            System.out.println("恭喜您中了1000万元");
        } else {
            System.out.println("很遗憾，您未中奖");
        }
    }


    // 遍历数组
    public static void bl1(int[] bl2) {
        System.out.print("[");
        for (int i = 0; i < bl2.length; i++) {
            System.out.print(i == bl2.length - 1 ? bl2[i] : bl2[i] + "，");
        }
        System.out.print("]");
    }
}
