package tk.siastv.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 目标：完成飞机票的价格计算
        // 1、让用户输入机票原价，月份，仓位类型
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double jpyj = sr.nextDouble();
        System.out.println("请输入机票月份（1-12）：");
        int jpyf = sr.nextInt();
        System.out.println("请输入仓位类型：");
        String cwlx = sr.next();
        System.out.println("机票优惠后的价格是：" + ff1(jpyj, jpyf, cwlx));
    }

    public static double ff1(double jpyj, int jpyf, String cwlx) {
        if (jpyf >= 5 && jpyf <= 10) {
            // 旺季
            switch (cwlx) {
                case "头等舱":
                    jpyj *= 0.9;
                    break;
                case "经济舱":
                    jpyj *= 0.85;
                    break;
                default:
                    System.out.println("您输入的仓位错误，请重新输入");
                    jpyj = -1;
            }
        } else if (jpyf == 11 || jpyf == 12 && jpyf >= 1 && jpyf <= 4) {
            // 淡季
            switch (cwlx) {
                case "头等舱":
                    jpyj *= 0.7;
                    break;
                case "经济舱":
                    jpyj *= 0.65;
                    break;
                default:
                    System.out.printf("您输入的仓位错误，请重新输入");
                    jpyj = -1;
            }
        } else if (jpyf > 12 || jpyf < 1) {
            System.out.println("您月份输入错误，请重新输入");
            jpyj = -1;
        }
        return jpyj;
    }
}
