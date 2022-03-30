package tk.siastv.xh;

public class ForTest2 {
    public static void main(String[] args) {
        //需求：求0-10的奇数和
        //3、定义一个求个的变量，累加奇数和
        int sum = 0;
        //1、定义一个循环找到 1 2 ... 10
        for (int i = 1; i <= 10; i++) {
            //i = 1 2 3 4 5 6 7 8 9 10
            System.out.println(i);
            //利用if 筛选出奇数
            if (i % 2 == 1) {
                //奇数 1 3 5 7 9
                sum += i;
            }
        }
        System.out.println("1到10的和为：" + sum);

        System.out.println("------------------");
        int sum1 = 0;
        for (int i = 1; i <=10; i += 2) {
            sum1 += i;
        }
        System.out.println(sum1);
    }
}
