package Factory_Method_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
