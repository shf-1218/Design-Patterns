package Abstract_Factory_Pattern.example;

import utils.XMLUtil;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory skinFactory = (SkinFactory) XMLUtil.getBean("abstractClassName");
        skinFactory.createButton().display();
        skinFactory.createTextField().display();
    }
}
