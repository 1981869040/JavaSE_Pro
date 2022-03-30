package tk.siastv.demo;

public class Test4 {
    public static void main(String[] args) {
        // 需求：把一个数组的元素复制到另一个数组
        int[] sz1 = {10, 20, 30, 40};
        int[] sz2 = new int[sz1.length];
        sz1(sz1, sz2);
        sz2(sz1);
        sz2(sz2);
    }

    public static void sz2(int[] fzsz3) {
        System.out.print("[");
        for (int i = 0; i < fzsz3.length; i++) {
            System.out.print(i == fzsz3.length - 1 ? fzsz3[i] : fzsz3[i] + "，");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void sz1(int[] fzsz1, int[] fzsz2) {
        // 正式完成数组复制
        for (int i = 0; i < fzsz1.length; i++) {
            fzsz2[i] = fzsz1[i];
        }

    }
}
