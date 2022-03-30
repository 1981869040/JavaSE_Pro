package tk.siastv.arraylist;

import java.util.ArrayList;

// 案例：集合存储自定义元素并遍历
// 需求：定义电影类（名称，分值，演员）。创建三个电影对象，代表三部影片，存入集合中遍历
// 《肖申克的救赎》,9.7,罗宾斯
// 《霸王别姬》,9.6,张国荣、张丰毅
// 《阿甘正传》,9.5,汤姆.汉克斯
public class ArrayListTest5 {
    // 目标：理解ArrayList集合存储自定义类型的对象
    // 1、定义电影类
    // 2、创建3个电影对象
    public static void main(String[] args) {
        Movie dy = new Movie("《肖申克的救赎》", 9.7, "罗宾斯");
        Movie dy1 = new Movie("《霸王别姬》", 9.6, "张国荣、张丰毅");
        Movie dy2 = new Movie("《阿甘正传》", 9.5, "汤姆.汉克斯");

        // 3、创建一个电影类型的ArrayList的集合，存储3部电影对象
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(dy);
        movies.add(dy1);
        movies.add(dy2);

        // 4、遍历电影类型集合中的每个电影对象，访问他们的信息即可
        for (int i = 0; i < movies.size(); i++) {
            Movie d = movies.get(i);
            System.out.println("电影名称" + d.getName());
            System.out.println("电影平凡" + d.getPingfen());
            System.out.println("电影主演" + d.getZhuyan());
            System.out.println("-------------------------");
        }
    }
}
