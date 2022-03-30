package tk.siastv.string;

import java.util.Scanner;
// 模拟用户登陆，只有三次登陆机会

public class StringDemo7 {
    public static void main(String[] args) {
        String okName = "denglu";
        String okPassword = "123456";
        Scanner sr = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入登录名：");
            String name = sr.next();
            System.out.println("请输入密码");
            String password = sr.next();
            if (okName.equals(name) && okPassword.equals(password)){
                System.out.println("登陆成功");
            }else {
                System.out.println("登陆失败");
                System.out.println("还有"+(3-i)+"次机会");
            }
        }

    }
}
