package Builder_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 */
public abstract class BikeBuilder {
    Bike bike = new Bike();

    public abstract void buildTyre();

    public abstract void buildFrame();

    public abstract void buildGps();

    public Bike retrieveResult() {
        this.buildTyre();
        this.buildFrame();
        this.buildGps();
        return bike;
    }
}
