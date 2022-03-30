package tk.siastv.gouzaoqi;

// 目标：认识构造器，明白两种类型的构造器的作用
public class Test1 {
    public static void main(String[] args) {
        // 通过调用得到构造器
        Car bm = new Car();
        bm.name ="宝马";
        bm.jiage = 100;
        System.out.println(bm.name);
        System.out.println(bm.jiage);

        Car bc = new Car("奔驰",200);
        System.out.println(bc.name);
        System.out.println(bc.jiage);
    }
}
