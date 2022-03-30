package tk.siastv.JavaBean;

// 1、成员变量建议使用private私有
public class User {
    private String name;
    private int age;
    private double shouru;

    // 3、提供无参数构造器，有参数构造器可选
    public User() {
    }

    public User(String name, int age, double shouru) {
        this.name = name;
        this.age = age;
        this.shouru = shouru;
    }

    // 2、必须为成员变量提供成套的setter和getter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getShouru() {
        return shouru;
    }

    public void setShouru(double shouru) {
        this.shouru = shouru;
    }
}
