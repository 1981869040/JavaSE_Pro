package tk.siastv.JavaBean;

public class Test1 {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("张三");
        u1.setAge(20);
        u1.setShouru(100);
        System.out.println(u1.getName());
        System.out.println(u1.getAge());
        System.out.println(u1.getShouru());

        User u2 = new User("李四",30,200);
        System.out.println(u2.getName());
        System.out.println(u2.getAge());
        System.out.println(u2.getShouru());
    }
}
