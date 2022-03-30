package tk.siastv.canshu;

public class CanShu1 {
    public static void main(String[] args) {
        int a = 20;
        ff1(a);
        System.out.println(a);
    }

        public static void ff1(int a) {
        System.out.println(a);  // 20
        a = 30;
        System.out.println(a);  // 30
    }
}
