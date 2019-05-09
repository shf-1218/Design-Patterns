package Builder_Pattern.example;

import utils.XMLUtil;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 */
public class Client {
    public static void main(String[] args) {
        BikeBuilder bikeBuilder = (BikeBuilder) XMLUtil.getBean("builderClassName");
        System.out.println(bikeBuilder.retrieveResult().toString());
    }
}
