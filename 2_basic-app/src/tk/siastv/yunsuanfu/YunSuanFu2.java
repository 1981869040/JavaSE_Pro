package tk.siastv.yunsuanfu;

public class YunSuanFu2 {
    public static void main(String[] args) {
        //目标：+符号做连接符
        int a = 5;
        System.out.println("abc" + 'a');  //abca
        System.out.println("abc" + a);  //abc5
        System.out.println(5 + a); //10
        System.out.println("abc" + 5 + 'a'); //abc5a
        System.out.println(15 + "abc" + 15);  //15abc15
        System.out.println(a + 'a'); //102
        System.out.println(a + "" + 'a'); //5a
        System.out.println(a + 'a'+" yusuanfu"); //102 yunsuanfu
        System.out.println("yunsuanfu"+ a + 'a'); //yunsuanfu5a
        System.out.println("yunsuanfu"+ ( a + 'a')); //yunsuanfu102
    }
}
