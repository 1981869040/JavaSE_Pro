package tk.siastv.thisdemo;

public class Car {
    String name;
    double jiage;

    public Car() {
        System.out.println("==这是无参数构造器==");
        System.out.println("这是无参数构造器的this:" + this);
    }
// 注意：this在构造器中，代表构造器正在初始化的那个对象
    public Car(String name, double jiage) {
        this.name = name;
        this.jiage = jiage;
        System.out.println("==这是有参数构造器==");
        System.out.println("这是有参数构造器的this:" + this);
    }
// 注意：this在方法中，谁调用这个方法this就代表谁！
    public void ff() {
        System.out.println("这是方法的this:" + this);
    }

    public void ff2(String name) {
        System.out.println(this.name + "正在和" + name + "比赛");
    }
}
