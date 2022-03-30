package tk.siastv.demo;

import java.security.PublicKey;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 需求：定义一个方法返回一个随机验证码
        String code = yzm(5);
        System.out.println("随机验证码为：" + code);
    }

    public static String yzm(int n) {
        Random sj = new Random();
        // 定义一个字符串变量记录生产的字符
        String code = "";
        // 定义一个for循环 ，循环n次，依次随机生成字符
        for (int i = 0; i < 5; i++) {
            int sj1 = sj.nextInt(3); // 0 1 2
            switch (sj1) {
                case 0:
                    // 大写字符 （A 65 - Z + 25)
                    char dx = (char) (sj.nextInt(26) + 65);
                    code += dx;
                    break;
                case 1:
                    // 小写字符 （a 97 -z +25)
                    char xx = (char) (sj.nextInt(26) + 97);
                    code += xx;
                    break;
                case 2:
                    // 数字 （0 - 9）
                    int sz = sj.nextInt(9);
                    code += sz;
                    break;
            }
        }
        return code;
    }
}
