package tk.siastv.fengzhuang;

// 目标：学习如何更好的封装
public class Test1 {
    public static void main(String[] args) {
        Student a = new Student();
        a.setAge(100);
        a.setAge(-100);
        System.out.println(a.getAge());
    }
}
