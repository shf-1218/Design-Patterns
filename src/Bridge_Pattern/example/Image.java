package Bridge_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 * 抽象类
 */
public abstract class Image {

    protected OperSystem operSystem;

    public void setOperSystem(OperSystem operSystem) {
        this.operSystem = operSystem;
    }

    public abstract void parseFile();
}
