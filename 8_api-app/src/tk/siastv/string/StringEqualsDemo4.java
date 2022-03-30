package tk.siastv.string;

import java.util.Scanner;

public class StringEqualsDemo4 {
    public static void main(String[] args) {
        // 1、正确的登录用户名和密码
        String okName = "denglu";
        String okPassword = "123456";

        // 2、用户输入用户名和密码
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sr.next();
        System.out.println("请输入密码");
        String password = sr.next();

        // 3、判断用户输入的登录名和密码与正确的内容是否相等
        // 字符串内容不适合用 == 比较
        if (okName.equals(name) && okPassword.equals(password)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        // 4、忽略大小写比较内容的API，一般用于验证码这样的业务逻辑
        String code1 = "AbcD";
        String code2 = "abcd";
        System.out.println(code1.equals(code2)); // false
        System.out.println(code1.equalsIgnoreCase(code2));  // true
    }
}
