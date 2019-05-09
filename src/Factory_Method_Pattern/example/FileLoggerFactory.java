package Factory_Method_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * 文件日志记录器工厂类：具体工厂
 */
public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
