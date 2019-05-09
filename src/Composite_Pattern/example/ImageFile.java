package Composite_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 * 图像文件类：叶子构件
 */
public class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }


    @Override
    public void killVirs() {
        System.out.println("----对图片文件'" + name + "'进行杀毒");
    }
}
