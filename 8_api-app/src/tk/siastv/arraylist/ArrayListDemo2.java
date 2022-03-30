package tk.siastv.arraylist;

import java.util.ArrayList;

// 目标“能够使用泛型约束ArrayList集合操作的数据类型
public class ArrayListDemo2 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList(); // JDK 1.7开始，泛型后面的类型声明可以不写
        list.add("文字");
        list.add("abc");
//        list.add(123);
//        list.add(123.123);

        ArrayList<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
    }
}
