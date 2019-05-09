package Builder_Pattern.example;

/**
 *
 * @author hongfei.shen
 * @date 2019/03/19
 * @description 自行车对象
 */
public class Bike {
    //轮胎
    private String tyre;
    //车架
    private String frame;
    //Gps定位
    private String gps;

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "tyre='" + tyre + '\'' +
                ", frame='" + frame + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
