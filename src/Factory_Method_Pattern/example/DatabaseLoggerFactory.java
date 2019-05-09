package Factory_Method_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * 数据库日志记录器工厂类：具体工厂
 */
public class DatabaseLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
