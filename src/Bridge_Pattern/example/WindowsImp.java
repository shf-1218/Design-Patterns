package Bridge_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 * Windows操作系统实现类：具体实现类
 */
public class WindowsImp implements OperSystem {

    @Override
    public void doPaint() {
        System.out.println("在Windows操作系统中显示图像：");
    }
}
