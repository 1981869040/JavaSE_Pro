package tk.siastv.xh;

public class WhileTest1 {
    public static void main(String[] args) {
        //需求：珠穆朗玛峰的高度是 8848860 纸张厚度 0.1 折叠纸张直到不低于珠穆朗玛峰的高度，求折叠的次数
        //1、定义变量 山峰的高度 纸张的厚度
        double zhi = 0.1;
        double zf = 8848860;
        //3、定义一个变量记录纸张折叠的次数
        int count = 0;
        //2、定义一个while循环控制纸张折叠
        while (zhi < zf){
            //每折叠一次，纸张厚度变厚一倍
                zhi *= 2;
            count++;

        }
        System.out.println("纸张折叠的次数" + count);
        System.out.println("纸张的厚度" + zhi);
    }
}
