package tk.siastv.yunsuanfu;

public class YunSuanFu7 {
    public static void main(String[] args) {
        //目标：学会三元运算符，理解其运算流程
        int score = 9;
        String chengji = score >60 ? "成绩合格" : "挂科";
        System.out.println(chengji);

        //需求：从两个数中找出最大值
        int a1 = 10;
        int b1 = 20;
        int max1 = a1 > b1 ? a1 : b1;
        System.out.println(max1);

        System.out.println("------------------------------");
        //从三个整数中，找到最大值并输出
        int a2 = 100;
        int b2 = 200;
        int c2 = 110;
        //1、首先比较两个数的最大值，得出临时最大值
        int max2 = a2 > b2 ? a2 : b2;
        //2、拿临时变量与第三个变量比较最大值
        int max3 = max2 > c2 ? max2 : c2;
        System.out.println(max3);

        System.out.println("-----------扩展知识----------");
        int max4 =a2 > b2 ? a2 > c2 ? a2 : b2 : b2 > c2 ? b2 : c2;
        System.out.println(max4);

    }
}
