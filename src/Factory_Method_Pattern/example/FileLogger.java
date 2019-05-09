package Factory_Method_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
