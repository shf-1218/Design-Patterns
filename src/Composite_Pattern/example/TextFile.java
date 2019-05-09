package Composite_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 * 文本文件类：叶子构件
 */
public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirs() {
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}
