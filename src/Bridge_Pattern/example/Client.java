package Bridge_Pattern.example;

import utils.XMLUtil;

/**
 * @author hongfei.shen
 * @date 2019/04/01
 */
public class Client {
    public static void main(String[] args) {
        Image image = (Image) XMLUtil.getBean("imageClassName");
        OperSystem operSystem = (OperSystem) XMLUtil.getBean("osClassName");
        image.setOperSystem(operSystem);
        image.parseFile();

    }
}
