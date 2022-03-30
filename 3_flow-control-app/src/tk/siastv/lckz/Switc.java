package tk.siastv.lckz;

public class Switc {
    public static void main(String[] args) {
        //Switch分支结构
        String riqi = "一号";
        switch (riqi) {
            case "一号":
                System.out.println("今天是一号");
                break;
            case "二号":
                System.out.println("今天是二号");
                break;
            case "三号":
                System.out.println("今天是三号");
                break;
            case "四号":
                System.out.println("今天是四号");
                break;
            case "五号":
                System.out.println("今天是五号");
                break;
            default:
                System.out.println("日期查找错误");
        }
    }
}
