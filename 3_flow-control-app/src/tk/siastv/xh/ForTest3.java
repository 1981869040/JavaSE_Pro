package tk.siastv.xh;

public class ForTest3 {
    public static void main(String[] args) {
        //需求：找出水仙花数并输出 水仙花数必须为三位数，并且水仙花数的个十百位加起来必须为原数
        //在循环外定义一个变量用于记录水仙花的个数
        int count = 0;
        //定义一个循环，找出所有的三位数
        for (int i = 100; i <= 999; i++) {
            //分别找出 个 十 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            //2、判断这个三位数是否符合标准
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i){
                System.out.print(i+"\t");
                count++;
            }
        }
        System.out.println();
        System.out.println("水仙花的个数是：" + count);
    }
}
