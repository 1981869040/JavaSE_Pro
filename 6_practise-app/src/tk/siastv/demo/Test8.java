package tk.siastv.demo;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        // 需求：双色球系统
        // 随机生成 7 位数 ， 6 个红球，1 一个篮球
        // 用户输入选择的号码
        // 红球号码 1 - 33 之间，篮球号码 1 - 16之间 不能重复

        int[] suijihaoma = suijifangfa();
        bl(suijihaoma);
        System.out.println();
        int[] shuruhaoma = shuruhaoma();
//        System.out.print("您输入的号码是：");
//        bl(shuruhaoma);
        jiangxiang(suijihaoma,shuruhaoma);
    }

    // 随机号码
    public static int[] suijifangfa() {
        // 定义一个动态初始化数组
        int[] suijihaoma = new int[7]; // 0 1 2 3 4 5 6
        Random suiji = new Random();
        // 建立一个for循环随机出红球的数字
        for (int i = 0; i < suijihaoma.length - 1; i++) {
            // 创建死循环，查询数字是否重复
            // 定义默认不重复
            boolean flag = true;
            while (true) {
                // 开始随机数字
                int suijihaoma2 = suiji.nextInt(33) + 1;
                // 循环查询生成的数字是否重复，重复则跳出循环
                for (int j = 0; j < i; j++) {
                    if (suijihaoma[j] == suijihaoma2) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    suijihaoma[i] = suijihaoma2;
                    break;
                }
            }
        }
        suijihaoma[suijihaoma.length - 1] = suiji.nextInt(16) + 1;
        return suijihaoma;
    }

    // 用户输入号码
    public static int[] shuruhaoma() {
        // 创建动态初始化数组，接收用户输入的号码
        int[] shuruhaoma = new int[7];
        Scanner shuru = new Scanner(System.in);
        // 开始循环让用户输入号码
        for (int i = 0; i < shuruhaoma.length; i++) {
            System.out.println(i == shuruhaoma.length - 1 ? "请输入第7位篮球号码：（1-16之间不重复）" : "请输入第" + (i + 1) + "红球位号码：（1-33之间不重复）");
            int shuruhaoma2 = shuru.nextInt();
            shuruhaoma[i] = shuruhaoma2;
        }
        return shuruhaoma;
    }

    // 判断中奖情况
    public static void jiangxiang(int[] suijihaoma, int[] shuruhaoma) {
        // 红球中奖数
        int hongqiu = 0;
        //篮球中奖数
        int lanqiu = 0;
        // 遍历随机号码对比用户输入号码 判断中了几个红球
        for (int i = 0; i < suijihaoma.length - 1; i++) {
            for (int j = 0; j < shuruhaoma.length - 1; j++) {
                // 用户号码对比随机号码
                if (shuruhaoma[j] == suijihaoma[i]) {
                    hongqiu++;
                    break;
                }
            }
        }
        System.out.println("中奖号码是：");
        bl(suijihaoma);
        System.out.println();
        System.out.println("您输入的号码是：");
        bl(shuruhaoma);
        System.out.println();
        // 判断篮球是否中奖
        lanqiu = suijihaoma[suijihaoma.length - 1] == shuruhaoma[shuruhaoma.length - 1] ? 1 : 0;

        //判断中奖个数
        if (lanqiu == 1 && hongqiu < 2) {
            System.out.println("恭喜您中了六等奖 5元");
        } else if (lanqiu == 1 && (hongqiu == 2 || hongqiu == 3)) {
            System.out.println("恭喜您中了五等奖 10元");
        } else if (hongqiu == 4 && (lanqiu == 0 || lanqiu == 1)) {
            System.out.println("恭喜您中了四等奖 200元");
        } else if (hongqiu == 5 && (lanqiu == 0 || lanqiu == 1)) {
            System.out.println("恭喜您中了三等奖 3000元");
        } else if (hongqiu == 6 && lanqiu == 0) {
            System.out.println("恭喜您中了二等奖 500万元");
        } else if (hongqiu == 6 && lanqiu == 1) {
            System.out.println("恭喜您中了一等奖 1000万元");
        } else {
            System.out.println("很遗憾您没有中奖");
        }
    }

    // 创建一个遍历循环
    public static void bl(int[] bl) {
        System.out.print("[");
        for (int i = 0; i < bl.length; i++) {
            System.out.print(i == (bl.length - 1) ? bl[i] : bl[i] + "，");
        }
        System.out.print("]");
    }
}
