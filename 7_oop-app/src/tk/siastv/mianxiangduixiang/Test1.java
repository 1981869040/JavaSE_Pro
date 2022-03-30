package tk.siastv.mianxiangduixiang;

public class Test1 {
    public static void main(String[] args) {
        // 目标：学会设计对象并使用
        Car c = new Car();
        c.name = "宝马";
        c.jiage = 20.20;
        System.out.println(c.name);
        System.out.println(c.jiage);

        c.name1();
        c.jiage1();
        System.out.println("--------------");

        Car b = new Car();
        b.name = "奔驰";
        b.jiage = 30.30;

        b.name1();
        b.jiage1();
    }
}
