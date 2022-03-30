package tk.siastv.xh;

public class BreakAndContinue1 {
    public static void main(String[] args) {
        //目标：理解break和continue
        for (int i = 0; i < 5; i++) {
            System.out.println("循环123");
            if (i == 2) {
                break;
            }
        }
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("循环：" + i);
        }
    }
}
