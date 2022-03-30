package tk.siastv.demo;

public class AnLi2 {
    public static void main(String[] args) {
        // 需求：判断整数是奇数还是偶数
        ff1(0);
        ff1(2);
        ff1(3);
    }

    public static void ff1(int n) {
        if (n == 0) {
            System.out.println("您输入的是 0 ，请重新输入");
        } else {
            if (n % 2 == 0) {
                System.out.println(n + " 是偶数");
            } else {
                System.out.println(n + " 是奇数");
            }
        }
    }
}
