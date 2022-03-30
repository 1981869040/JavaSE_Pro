package tk.siastv.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

// "20180302", "叶孤城", 23, "护理一班"
// "20180303", "东方不败", 23, "推拿一班"
// "20180304", "西门吹雪", 26, "中药学四班"
// "20180305", "梅超风", 26, "神经科2班"

public class ArrayListTest6 {
    public static void main(String[] args) {
        // 1、定义学生类
        // 2、创建集合存储学生对象，创建学生对象封装学生信息

        Student xs = new Student("20180302", "叶孤城", 23, "护理一班");
        Student xs1 = new Student("20180303", "东方不败", 23, "推拿一班");
        Student xs2 = new Student("20180304", "西门吹雪", 26, "中药学四班");
        Student xs3 = new Student("20180305", "梅超风", 26, "神经科2班");

        // 把学生对象添加到集合中去
        ArrayList<Student> xt = new ArrayList<>();
        xt.add(xs);
        xt.add(xs1);
        xt.add(xs2);
        xt.add(xs3);

        // 3、遍历这些学生信息展示
        for (int i = 0; i < xt.size(); i++) {
            Student a = xt.get(i);
            System.out.println("学号：" + a.getXuehao());
            System.out.println("姓名：" + a.getName());
            System.out.println("年龄：" + a.getAge());
            System.out.println("班级：" + a.getBanji());
            System.out.println("----------------------");
        }
        Scanner sr = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要查询的学号：");
            String srxh = sr.next();
            Student bl = bl(xt, srxh);
            if (bl != null) {
                System.out.println("您查询的学生信息如下：");
                System.out.println("学号：" + bl.getXuehao());
                System.out.println("姓名：" + bl.getName());
                System.out.println("年龄：" + bl.getAge());
                System.out.println("班级：" + bl.getBanji());
            } else {
                System.out.println("查无此人");
            }
        }
    }
    // 4、定义方法完成按照学号的搜索功能
    /**
     * 根据学生的学号查询信息并返回
     * @param xt   存储全部学生对象的集合
     * @param srxh 搜索的学生的学号
     * @return 学生对象 | null
     */
    public static Student bl(ArrayList<Student> xt, String srxh) {
        for (int i = 0; i < xt.size(); i++) {
            Student a = xt.get(i);
            if (a.getXuehao().equals(srxh)) {
                return a;
            }
        }
        return null;
    }
}
