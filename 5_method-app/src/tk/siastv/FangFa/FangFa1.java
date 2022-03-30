package tk.siastv.FangFa;

public class FangFa1 {
    public static void main(String[] args) {
        // 目标：学习方法的完整定义格式，并理解其调用和执行流程
        int dy1 = ff1(100, 200);
        System.out.println("和是：" + dy1);
        ff1(1,2);

        int dy2 = ff1(200, 400);
        System.out.println("和是：" + dy2);
    }

    public static int ff1(int a, int b) {
        int c = a + b;
        return c;
    }
}
