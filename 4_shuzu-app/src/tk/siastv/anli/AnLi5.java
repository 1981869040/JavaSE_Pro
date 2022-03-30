package tk.siastv.anli;

public class AnLi5 {
    public static void main(String[] args) {
        // 冒泡排序
        // 1、创建数组
        int[] mp = {40, 20, 30, 10};

        // 2、定义一个循环的论述 数组长度-1
        for (int i = 0; i < mp.length - 1; i++) {

            // 3、定义一个循环控制每轮比较的次数，占位
            for (int j = 0; j < mp.length - i -1; j++) {
                // 判断j当前位置的元素 是否 大于后一个位置 若较大则交换
                if (mp[j] > mp[j + 1]) {
                    int ls = mp[j + 1];
                    mp[j + 1] = mp[j];
                    mp[j] = ls;
                }
            }
        }
        for (int i = 0; i < mp.length; i++) {
            System.out.print(mp[i] + "\t");
        }
    }
}
