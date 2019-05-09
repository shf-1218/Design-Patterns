package Composite_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 * 视频文件类：叶子构件
 */
public class VideoFile extends AbstractFile {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirs() {
        System.out.println("----对视频文件'" + name + "'进行杀毒");
    }
}
