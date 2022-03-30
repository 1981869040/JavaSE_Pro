package tk.siastv.yunsuanfu;

public class YunSuanFu6 {
    public static void main(String[] args) {
        //目标：学会使用逻辑运算符，并能选择合适的逻辑运算符
        double chicun = 6.7;
        double neicun = 16;
        //需求：尺寸大于等于 4 ，内存大于等于 2 。
        //前后都是 ture ，结果才是 true。
        System.out.println(chicun >= 4 & neicun >= 2);

        //需求：尺寸大于等于 4 ，或 内存大于等于 20 。
        //只要有一个结果是 true ，结果就是 true。
        System.out.println(chicun >= 4 | neicun >= 20);

        System.out.println(!false); //true
        System.out.println(!true);  //false

        //逻辑异或：必须两个结果不同才是true
        System.out.println(false ^ true); //true
        System.out.println(true ^ false); //true
        System.out.println(true ^ true); //false
        System.out.println(false ^ false);//false

        System.out.println("-------------------------");
        //&& || 与 & | 的区别
        int a1 = 10;
        int b1 = 20;
        System.out.println(a1 > 100 && ++a1 > 10);
        System.out.println(a1);

        System.out.println(a1 > 1 || ++b1 >10);
        System.out.println(b1);

        int c1 = b1++;
        System.out.println(c1);
        System.out.println(b1);
    }
}
