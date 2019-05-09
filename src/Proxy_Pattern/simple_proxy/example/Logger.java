package Proxy_Pattern.simple_proxy.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 */
public class Logger {
    //模拟实现日志记录
    public static void Log(String userId) {
        System.out.println(String.format("更新数据库，用户'{%s}'查询次数加1！", userId));
    }
}
