package tk.siastv.yunsuanfu;

public class YunSuanFu4 {
    public static void main(String[] args) {
        //目标：学会使用赋值运算符 += -= *= /= %=
        int a1 = 10;
        int b1 = 20;
//        a1 = a1 + b1;
        a1 +=b1; //a1 = (int) (a1+b1)
        System.out.println(a1);

        byte a2 = 11;
        byte b2 = 21;
//        a2 = (byte) (a2 + b2);
        a2 += b2;  //(byte) (a2 + b2)
        System.out.println(a2);

        int a3 = 12;
        int b3 = 22;
        //a3 += b3 //a3 = (int)(a3+3）
        a3 -= b3; //a3 = (int)(a3-3）
        //a3 *= b3; //a3 = (int)(a3*3）
        //a3 /= b3; //a3 = (int)(a3/3）
        //a3 %= b3; //a3 = (int)(a3&3）
        System.out.println(a3);
    }
}
