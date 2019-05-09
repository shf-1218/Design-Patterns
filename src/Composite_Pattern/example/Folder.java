package Composite_Pattern.example;

import java.util.ArrayList;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 * Folder充当容器构件类
 */
public class Folder extends AbstractFile {
    private String name;
    private ArrayList<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile abstractFile) {
        fileList.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile) {
        fileList.remove(abstractFile);
    }

    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirs() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒
        for (AbstractFile abstractFile : fileList) {
            abstractFile.killVirs();
        }
    }
}
