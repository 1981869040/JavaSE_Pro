package tk.siastv.arraylist;

public class Movie {
    private String name;
    private double pingfen;
    private String zhuyan;

    public Movie() {
    }

    public Movie(String name, double pingfen, String zhuyan) {
        this.name = name;
        this.pingfen = pingfen;
        this.zhuyan = zhuyan;
    }

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
