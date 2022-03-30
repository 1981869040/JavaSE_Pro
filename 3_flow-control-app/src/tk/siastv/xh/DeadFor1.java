package tk.siastv.xh;

import java.util.Scanner;

public class DeadFor1 {
    public static void main(String[] args) {
        //目标：学会定义死循环
//        for (; ; ) {
//            System.out.println("Hello Word");
//        }

//        while (true){
//            System.out.println("Hello Word");
//        }

//        do {
//            System.out.println("Hello Word");
//        }while (true);
        System.out.println("--------------------");
        //1、定义一个正确的密码
        int okPassword = 520;
        //2、定义一个死循环，让用户不断的输入密码
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请您输入正确的密码");
            int password = sc.nextInt();
            //3、使用if语句判断密码是否正确
            if (password == okPassword){
                System.out.println("成功登陆");
                break;
            }else {
                System.out.println("密码错误，请重新输入");
            }

        }
    }
}
