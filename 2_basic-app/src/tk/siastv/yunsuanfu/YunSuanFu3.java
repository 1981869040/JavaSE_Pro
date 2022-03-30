package tk.siastv.yunsuanfu;

public class YunSuanFu3 {
    public static void main(String[] args) {
        //目标：学会使用自增自减运算符 ++ --
        int a1 = 10;
        a1++;
        System.out.println(a1);
        int b1 = 10;
        --b1;
        System.out.println(b1);

        //在表达式中或者不是单独操作的情况下，++ --在变量前后存在区别
        //++ -- 在变量前面，先 +1 -1 后在使用
        int a2 = 10;
        int b2 = ++a2;
        System.out.println(a2);
        System.out.println(b2);

        //++ -- 在变量后面时，先使用再 +1 -1
        int a3 = 10;
        int b3 = a3--;
        System.out.println(a3);
        System.out.println(b3);

    }
}
