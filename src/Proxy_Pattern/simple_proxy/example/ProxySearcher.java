package Proxy_Pattern.simple_proxy.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 */
public class ProxySearcher implements Searcher {
    private RealSearcher searcher = new RealSearcher(); //维持一个对真实主题的引用

    private AccessValidator accessValidator;
    private Logger logger;

    @Override
    public String doSearcher(String userId, String keyWord) {
        if (this.accessValidator.validator(userId)) {
            String result = searcher.doSearcher(userId, keyWord); //调用真实主题对象的查询方法
            logger.Log(userId); //记录查询日志
            return result; //返回查询结果
        } else {
            return null;
        }

    }
}
