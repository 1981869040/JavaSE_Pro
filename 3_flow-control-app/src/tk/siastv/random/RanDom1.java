package tk.siastv.random;

import java.util.Random;

public class RanDom1 {
    public static void main(String[] args) {
        //目标：学会使用Java提供的随机数类Random
        //1、导包
        Random r = new Random();
        //2、创建随机数对象
        for (int i = 0; i < 5; i++) {
            //3、调用nextInt功能（方法）可以返回一个整型的随机数给你
            int date = r.nextInt(10);//0 - 9 不包含10 （包前不包后）
            System.out.println(date);
        }
    }
}
