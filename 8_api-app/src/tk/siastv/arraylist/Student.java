package tk.siastv.arraylist;

import java.util.ArrayList;

public class Student {
    private String  xuehao;
    private String name;
    private int age;
    private String banji;

    public Student() {
    }

    public Student(String  xuehao, String name, int age, String banji) {
        this.xuehao = xuehao;
        this.name = name;
        this.age = age;
        this.banji = banji;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

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

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }
}
