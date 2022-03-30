package tk.siastv.thisdemo;

public class Test1 {
    public static void main(String[] args) {
        Car a = new Car();
        a.name = "宝马";
        a.jiage = 100;
        System.out.println(a.name);
        System.out.println(a.jiage);
        a.ff();
        Car b = new Car("奔驰",200);
        System.out.println(b.name);
        System.out.println(b.jiage);

        b.ff2("宝马");
    }
}
