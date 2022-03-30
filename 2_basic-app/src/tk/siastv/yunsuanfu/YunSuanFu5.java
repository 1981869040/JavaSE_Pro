package tk.siastv.yunsuanfu;

public class YunSuanFu5 {
    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 10;
        boolean c1 = a1 == b1;
        System.out.println(c1);

        System.out.println(a1 == b1); //true
        System.out.println(a1 != b1); //false
        System.out.println(a1 > b1); //false
        System.out.println(a1 >= b1); //true
        System.out.println(a1 < b1); //false
        System.out.println(a1 <= b1); //true

        System.out.println("----------------------------");
        int a2 = 10;
        int b2 = 11;
        System.out.println(a2 == b2); //false
        System.out.println(a2 != b2); //true
        System.out.println(a2 > b2); //false
        System.out.println(a2 >= b2); //false
        System.out.println(a2 < b2); //true
        System.out.println(a2 <= b2); //true
    }
}
