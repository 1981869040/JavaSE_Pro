package tk.siastv.leixing;

public class LeXing {
    public static void main(String[] args) {
        //目标：理解自动类型转换
        byte a1 = 20;
        int b1 = a1; //发生了自动类型转换
        System.out.println(a1);
        System.out.println(b1);

        int a2 = 23;
        double b2 = a1; //发生了自动类型转换
        System.out.println(a2);
        System.out.println(b2);

        char a3 = 'a';
        int b3 = a3; //发生了自动类型转换
        System.out.println(a3);
        System.out.println(b3);

        char a4 = '中';
        int b4 = a4;
        System.out.println(a4);
        System.out.println(b4);
    }
}
