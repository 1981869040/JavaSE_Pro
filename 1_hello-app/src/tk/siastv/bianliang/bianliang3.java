package tk.siastv.bianliang;

public class bianliang3 {
    public static void main(String[] args) {
        //1、byte 字节型 占1个字节 -128 — 127
        byte byte1 = 98;
        System.out.println(byte1);
        // byte byte2= 128; //报错

        //2、short 短整型 占2个字节
        short shout1 = 30000;

        //3、int 整形 默认的类型 占4个字节（默认使用的类型）
        int int1 = 23002103;

        //4、long 长整型 占8个字节
        long long1 = 112323;
        //注意：随便写一个整数字面量默认的是int类型的，12323123123123121虽然没有超出long类型的范围，但超出了int类型的范围
        //如果希望随便写的一个整数字面量使用long类型，需要加 L / l
        long long2 = 1231231231233123L;

        //5、浮点数（小数）
        //float单精度 占4个字节
        //注意：随便写的一个小数字面量默认是double类型，如果希望随便写的字面量类型当成float类型，需要再后面加 F / f
        float float1 = 98.5F;

        //6、double 双精度 占8个字节
        double double1 = 99.999;

        //7、字符类型：char
        char char1 = 'a';
        char char2 = '中';
        //char char3 = '中国';  //报错

        //8、布尔类型 boolean
        boolean boolean1 = true;
        boolean boolean2 = false;

        System.out.println("-----------------引用数据类型-------------------");
        String String = "字符串";
        System.out.println(String);
    }
}
