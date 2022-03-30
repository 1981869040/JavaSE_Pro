package tk.siastv.memory;

public class NeiCun2 {
    public static void main(String[] args) {
        // 两个数组变量指向同一个数组对象
        int[] sz1 = {1,2,3,4};
        int[] sz2 = sz1;
        System.out.println(sz1);
        System.out.println(sz2);
    }
}
