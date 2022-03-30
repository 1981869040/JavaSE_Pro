package tk.siastv.returndemo;

public class ReturnDemo1 {
    public static void main(String[] args) {
        // 目标：明确return关键字的作用
        turn(2,0);
    }

    public static void turn(int a, int b) {
        if (b == 0) {
            System.out.println("您输入的数据有误，除数不能为0");
            return;
        }
        int c = a / b;
        System.out.println("结果是：" + c);
    }
}
