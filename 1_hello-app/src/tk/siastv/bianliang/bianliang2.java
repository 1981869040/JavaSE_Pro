package tk.siastv.bianliang;

public class bianliang2 {
    public static void main(String[] args) {
        //变量使用的注意事项
        //1、变量要声明在使用
        int a = 1;
        System.out.println(a);

        //2、变量声明后，不能存储其他类型的数据
        //a =1.5;

        //3、变量的有效范围从 { 到 } 范围之间截止，同一个范围内不能创建两个同名的变量。
        {
            int b = 2;
            System.out.println(b);
            //int b = 2;//报错
        }
        int b = 2;
        b = 3; //这不是定义，是赋值
        System.out.println(b);


        //4、定义变量时可以没有初始值，但是使用时必须要有初始值
        int c;
        c= 4;
        System.out.println(c);

        char ch = 'a';
        System.out.println(ch + 1);
    }
}
