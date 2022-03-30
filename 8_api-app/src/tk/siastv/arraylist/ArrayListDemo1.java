package tk.siastv.arraylist;

import java.util.ArrayList;

// 目标：创建Arraylist对象，代表集合容器，往里面添加元素
public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 1、创建ArrayList集合的对象
        ArrayList list = new ArrayList();

        // 2、添加数据
        list.add("java");
        list.add("abc");
        list.add("中国");
        list.add(1234);
        list.add("abc");
        System.out.println(list);

        // 3、给指定索引位置添加元素
        list.add(1,"元素");
        System.out.println(list);
    }
}
