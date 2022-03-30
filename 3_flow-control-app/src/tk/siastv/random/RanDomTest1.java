package tk.siastv.random;

import java.util.Random;
import java.util.Scanner;

public class RanDomTest1 {
    public static void main(String[] args) {
        Random r = new Random(); //随机数类
        Scanner rc = new Scanner(System.in); //键盘输入类

        while (true) {
            int date = r.nextInt(100) + 1; //生成一个1 - 100的随机数
            System.out.println(date); //显示答案
            System.out.println("请您输入所猜数字：");
            int date1 = rc.nextInt();

//            if (date == date1) {
//                System.out.println("恭喜您输入正确");
//                break; //直接跳出并结束当前死循环
//            } else if (date != date1) {
//                System.out.println("输入错误");
//            }

            if (date < date1) {
                System.out.println("您输入的数字过大");
            } else if (date > date1) {
                System.out.println("您输入的数字过小");
            } else {
                System.out.println("恭喜您输入正确");
                break; //直接跳出并结束当前死循环
            }
            System.out.println("-----------------------");
        }
    }
}
