package Bridge_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 */
public class GIFImage extends Image {
    @Override
    public void parseFile() {
        operSystem.doPaint();
        System.out.println("格式为GIF。");
    }
}
