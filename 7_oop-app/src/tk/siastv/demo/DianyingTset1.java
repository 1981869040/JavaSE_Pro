package tk.siastv.demo;

// 目标：完成电影信息的展示案例，理解面向对象变成的代码
// "《长津湖》" ,9.7,s"吴京"
// "《我和我的父辈》" ,9.6,"吴京"
// "《扑水少年》" ,9.5,"王川"
public class DianyingTset1 {
    public static void main(String[] args) {
        // 1、设计电影类
        // 2、创建三个电影对象，封装电影信息

        DianYing[] dys = new DianYing[3];
        dys[0] = new DianYing("《长津湖》", 9.7, "吴京");
        dys[1] = new DianYing("《我和我的父辈》", 9.6, "吴京");
        dys[2] = new DianYing("《扑水少年》", 9.5, "王川");

        for (int i = 0; i < dys.length; i++) {
            DianYing zs = dys[i];
            System.out.println("电影名称" + zs.getName());
            System.out.println("电影评分" + zs.getPingfen());
            System.out.println("电影主演" + zs.getZhuyan());
            System.out.println("-------------------------");
        }
    }
}
