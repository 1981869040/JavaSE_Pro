package tk.siastv.lckz;

public class Switc2 {
    public static void main(String[] args) {
        int month = 5;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月是31天");
                break;
            case 2:
                System.out.println(month + "闰年为29天，非闰年为28天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月为30天");
            default:
                System.out.println("数据有误");
        }
    }
}
