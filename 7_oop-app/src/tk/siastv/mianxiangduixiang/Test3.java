package tk.siastv.mianxiangduixiang;

public class Test3 {
    public static void main(String[] args) {
        Test3_1 xs1 = new Test3_1();
        xs1.name = "小明";
        xs1.sex = '女';
        xs1.hobby = "吃饭，睡觉，游戏";
        xs1.study();
        Test3_1 xs2 = xs1;
        xs2.hobby = "爱提问";
        System.out.println(xs2.name);
        System.out.println(xs2.sex);
        System.out.println(xs1.hobby);
        xs2.study();
        xs1.study();
    }
}
