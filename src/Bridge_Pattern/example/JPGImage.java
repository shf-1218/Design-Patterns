package Bridge_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 * JPG格式图像：扩充抽象类
 */
public class JPGImage extends Image {
    @Override
    public void parseFile() {
        operSystem.doPaint();
        System.out.println("格式为JPG。");
    }
}
