package tk.siastv.canshu;

public class CanShu2 {
    public static void main(String[] args) {
        // 目标：理解引用类型的参数传递机制：值传递，区分其不通电
        int[] sz1 = {1,2,3,4};
        System.out.println(sz1[1]);
        ff1(sz1);
        System.out.println(sz1[1]);
    }
    public static void ff1(int[]sz2){
        System.out.println(sz2[1]);
        sz2[1] = 200;
    }
}
