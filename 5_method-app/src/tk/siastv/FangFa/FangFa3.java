package tk.siastv.FangFa;

public class FangFa3 {

    public static void ff1() {
        System.out.println("Hello Word");
    }

    public static void main(String[] args) {
        // 方法的编写顺序无所谓
        // 方法与方法之间是平级关机，不能嵌套定义
        // 方法的返回值类型为void（无返回值），方法内不则不能使用return返回数据
        // 如果方法的返回值类型写了具体类型，方法内部则必须使用return返回对应的类型

        System.out.println(ff2(10, 20));
    }
    // return语句下面，不能编写代码，因为永远执行不到，属于无效代码
    // 方法不调用不执行，调用时必须严格匹配方法的参数情况
    // 有返回值的方法调用可以选择定义变量接收结果，或直接输出调用，甚至直接调用；
    // 无返回值方法的调用只能直接调用一下
    public static int ff2(int a, int b) {
        // int c = a + b
        // return c;
        return a + b;
        // System.out.println("方法"); // 错误
    }
}
