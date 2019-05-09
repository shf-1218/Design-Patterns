package Proxy_Pattern.simple_proxy.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearcher(String userId, String keyword) {
        System.out.println(String.format("用户'{0}'使用关键词'{%s}'查询商务信息！", userId, keyword));
        return "返回具体内容";
    }
}
