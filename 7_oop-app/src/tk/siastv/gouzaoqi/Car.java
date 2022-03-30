package tk.siastv.gouzaoqi;

public class Car {

    String name;
    double jiage;

    // 默认生成 无参数构造器
    public Car() {
        System.out.println("==无参数构造器被调用了==");
    }

    public Car(String a, double b) {
        System.out.println("==有参数构造器被调用了==");
        name = a;
        jiage = b;
    }
}
