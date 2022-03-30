package tk.siastv.string;

import java.util.Scanner;
// 从键盘输入电话号码，将中间四位号码屏蔽
public class StringDemo8 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入电话号码：");
        String hm = sr.next();

        String substring = hm.substring(0, 3);
        // 0 1 2 3 4 5 6 7 8 9  10
        // 1 2 3 4 5 6 7 8 9 10 11
        String substring1 = hm.substring(7);
        System.out.println(substring);
        System.out.println(substring1);
        System.out.println(substring+"****"+substring1);

    }
}
