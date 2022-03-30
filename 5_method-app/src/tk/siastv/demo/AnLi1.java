package tk.siastv.demo;

public class AnLi1 {
    public static void main(String[] args) {
        // 需求：求 1-n 的和
        int sum = ff1(5);
        System.out.println("1-n的和为：" + sum);
    }

    public static int ff1(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            // n = 5
            // i=0 i<n i+1
            // i=1 i<n i+1
            // i=2 i<n i+1
            // i=3 i<n i+1
            // i=4 i<n i+1
            // i=5 i=n i+1
            //break
            sum += i;
            // sum = sum + i
            // sum = 0 i = 15
        }
        return sum;
    }
}
