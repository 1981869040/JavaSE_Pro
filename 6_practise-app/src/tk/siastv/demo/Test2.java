package tk.siastv.demo;

public class Test2 {
    public static void main(String[] args) {
        // 需求：判断 101 - 200 直接有多少个素数，并输出所有素数
        // 1、定义一个循环，找到101-200之间的全部数据
        for (int i = 101; i <= 200; i++) {

            //信号位：标记
            boolean flag = true; // 一开始认为当前数据是素数
            // 2、判断当前遍历的这个数据是否是素数
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            // 3、根据判定结果选择是否输出这个数据，是素数输出
            if (flag)
                System.out.println(i);
        }
    }
}
