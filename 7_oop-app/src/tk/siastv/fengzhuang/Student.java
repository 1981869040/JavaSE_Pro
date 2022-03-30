package tk.siastv.fengzhuang;

public class Student {
    // 1、成员变量 使用private修饰，只能在本类中访问了
    private int age;
    private String name;

    // 2、提供成套的getter和setter方法暴露取值和赋值
    public void setAge(int age) {
        if (age >= 0 && age <= 200) {
            this.age = age;
        } else {
            System.out.println("您输入的年龄有问题");
        }
    }

    public int getAge() {
        return age;
    }
}

