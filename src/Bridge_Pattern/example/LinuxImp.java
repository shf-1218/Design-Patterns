package Bridge_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 */
public class LinuxImp implements OperSystem {
    @Override
    public void doPaint() {
        System.out.println("在Linux操作系统中显示图像：");
    }
}
