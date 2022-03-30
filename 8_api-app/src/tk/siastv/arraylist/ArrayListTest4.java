package tk.siastv.arraylist;

import java.util.ArrayList;

// 目标：把成绩低于80分以下的数据去掉
// 成绩大致为：98,77,66,89,79,50,100
public class ArrayListTest4 {
    public static void main(String[] args) {
        ArrayList<Integer> cj = new ArrayList<>();
        cj.add(98);
        cj.add(77);
        cj.add(66);
        cj.add(89);
        cj.add(79);
        cj.add(50);
        cj.add(100);

//        // 完美方案之一
//            for (int i = 0; i < cj.size(); i++) {
//                int integer = cj.get(i);
//                if (integer < 80) {
//                    // 这个分数必须删除
//                    cj.remove(i);
//                    i--;
//                }
//        }
//        System.out.println(cj);

        // 完美方案之二 从后面倒着遍历再删除就可以
        for (int i = cj.size() - 1; i >= 0; i--) {
            int integer = cj.get(i);
            if (integer < 80) {
                // 这个分数必须删除
                cj.remove(i);
            }
        }
        System.out.println(cj);
    }
}
