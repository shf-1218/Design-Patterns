package Factory_Method_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * 日志记录器工厂接口：抽象工厂
 */
public abstract class LoggerFactory {

    public abstract Logger createLogger();

    public void writeLog() {
        this.createLogger().writeLog();
    }

}
