package Command_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/04/02
 * Command（抽象命令类）：抽象命令类一般是一个抽象类或接口，在其中声明了用于执行请求的execute()等方法，通过这些方法可以调用请求接收者的相关操作。
 */
public abstract class Command {
    public abstract void execute();
}
