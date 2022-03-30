package tk.siastv.demo;

public class AnLi4 {
    public static void main(String[] args) {
        // 目标：理解方法的内存运行机制
        xx();
    }

    public static void cf(){
        System.out.println("吃饭");
    }

    public static void sj(){
        System.out.println("睡觉");
    }

    public static void xx(){
        cf();
        System.out.println("学习");
        sj();
    }
}
