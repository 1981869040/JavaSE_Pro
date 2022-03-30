package tk.siastv.xh;

public class ForFor1 {
    public static void main(String[] args) {
        //嵌套循环
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("循环");
//            }
//            System.out.println("-----------------");
//        }

        System.out.println("-------分割线---------");
        for (int i = 0; i < 4; i++) {
            System.out.println("*****");
        }
        System.out.println("-------分割线---------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
