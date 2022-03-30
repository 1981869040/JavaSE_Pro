package tk.siastv.canshu;

public class AnLi3 {
    public static void main(String[] args) {
        int[] sz1 = {10, 20, 30, 40};
        ff(sz1);
        System.out.println();
        int[] sz2 = {};
        ff(sz2);
    }

    public static void ff(int[] sz2) {
        System.out.print("数组内容为：[");
        if (sz2 != null &&sz2.length>0){
            for (int i = 0; i < sz2.length; i++) {
//            if (i != sz2.length - 1) {
//                System.out.print(sz2[i] + ",");
//            } else {
//                System.out.print(sz2[i]);
//            }
                System.out.print(i == sz2.length - 1 ? sz2[i] : sz2[i] + "，");
            }
        }
        System.out.print("]");
    }
}
