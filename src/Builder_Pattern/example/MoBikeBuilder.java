package Builder_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 */
public class MoBikeBuilder extends BikeBuilder {


    @Override
    public void buildTyre() {
        bike.setTyre("橙色轮胎");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("橙色车架");
    }

    @Override
    public void buildGps() {
        bike.setGps("mobike定制版GPS定位装置");
    }

}
