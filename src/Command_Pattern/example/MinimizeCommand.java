package Command_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/04/02
 */
public class MinimizeCommand extends Command {
    private WindowHanlder windowHanlder;

    public MinimizeCommand() {
        this.windowHanlder = new WindowHanlder();
    }

    @Override
    public void execute() {
        windowHanlder.minimize();
    }
}
