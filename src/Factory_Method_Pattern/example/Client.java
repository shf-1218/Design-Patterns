package Factory_Method_Pattern.example;

import utils.XMLUtil;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory = (LoggerFactory) XMLUtil.getBean("factoryClassName");
        factory.writeLog();
    }
}
