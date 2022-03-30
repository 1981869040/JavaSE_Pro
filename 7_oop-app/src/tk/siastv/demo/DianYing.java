package tk.siastv.demo;

public class DianYing {
    // 成员变量
    private String name; // 电影名称
    private double pingfen; // 电影评分
    private String zhuyan; //电影主演

    //生成有参数构造器和无参数构造器
    public DianYing(){
    }
    public DianYing(String name,double pingfen,String zhuyan){
        this.name=name;
        this.pingfen=pingfen;
        this.zhuyan=zhuyan;
    }

    // 生成 setter 和 getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPingfen() {
        return pingfen;
    }

    public void setPingfen(double pingfen) {
        this.pingfen = pingfen;
    }

    public String getZhuyan() {
        return zhuyan;
    }

    public void setZhuyan(String zhuyan) {
        this.zhuyan = zhuyan;
    }


}
