package Builder_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 */
public class OfoBikeBuilder extends BikeBuilder {


    @Override
    public void buildTyre() {
        bike.setTyre("黑色轮胎");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("黄色车架");
    }

    @Override
    public void buildGps() {
        bike.setGps("ofo定制版GPS定位装置");
    }


}
