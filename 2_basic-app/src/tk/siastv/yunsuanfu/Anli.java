package tk.siastv.yunsuanfu;

public class Anli {
    public static void main(String[] args) {
        //拆分数字，分别输出
        int a1 = 5890;
        //1、个位
        int ge = a1 % 10;
        System.out.println(ge);
        //2、十位
        int shi = a1 / 10 % 10;
        System.out.println(shi);
        //3、百位
        int bai = a1 / 100 % 10;
        System.out.println(bai);
        //4、千位
        int qian = a1 / 1000;
        System.out.println(qian);

    }
}
