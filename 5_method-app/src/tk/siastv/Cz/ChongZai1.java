package tk.siastv.Cz;

public class ChongZai1 {
    public static void main(String[] args) {
        // 目标：识别方法重载的形式。并理解其调用流程，最后需要知道使用方法重载的好处

        fire();
        fire("某国");
        fire("某国",100);
    }

    public static void fire() {
        System.out.println("默认发射一枚武器");
    }

    public static void fire(String diqu) {
        System.out.println("默认发射一枚武器到" + diqu);
    }

    public static void fire(String diqu, int shuliang) {
        System.out.println("默认发射" + shuliang + "枚武器到" + diqu);
    }
}
