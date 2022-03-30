package tk.siastv.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("JAVA");
        list.add("Java");
        list.add("Mysql");
        list.add("MyBatis");
        list.add("HTML");

        // 1、public E get(int index); 获取某个索引位置处的值
        String s = list.get(1);
        System.out.println(s);

        // 2、public E size(); 获取集合的大小（元素个数）
        int size = list.size();
        System.out.println(size);

        // 3、完成集合的遍历
        System.out.println("[");
        for (int i = 0; i < list.size(); i++) {
//            System.out.print(i == list.size() - 1 ? list.get(i) : list.get(i) + ",");
            System.out.println(list.get(i));
        }
        System.out.print("]\n");

        // 4、public E remove(int index); 删除某个索引位置处的元素，并返回被删除的元素值
        String remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);

        // 5、public boolean remove(Object o); 直接删除元素值，删除成功后返回 true，删除失败则返回 false
        boolean mysql = list.remove("Mysql");
        System.out.println(mysql);
        System.out.println(list);

        // 6、public E set(int index,E element); 修改某个索引位置处的元素值
        String ys = list.set(1, "元素");
        System.out.println(ys);
        System.out.println(list);

    }
}
