package Bridge_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 * PNG格式图像：扩充抽象类
 */
public class PNGImage extends Image {
    @Override
    public void parseFile() {
        operSystem.doPaint();
        System.out.println("格式为PNG。");
    }
}
