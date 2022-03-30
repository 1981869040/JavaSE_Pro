package tk.siastv.string;

import java.util.Random;

// 练习题：使用String完成随机生成5位数验证码
public class StringDemo6 {
    public static void main(String[] args) {
        String yzm = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random sj = new Random();
        String c = "";
        for (int i = 0; i < 5; i++) {
            int sj1 = sj.nextInt(yzm.length());
            char c1 = yzm.charAt(sj1);
            c += c1;
        }
        System.out.println(c);
    }
}
