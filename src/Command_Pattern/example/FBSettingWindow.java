package Command_Pattern.example;

import java.util.ArrayList;

/**
 * @author hongfei.shen
 * @date 2019/04/02
 * 功能键设置窗口类
 */
public class FBSettingWindow {
    private String title;//窗口标题
    private ArrayList<FunctionButton> functionButtonList = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<FunctionButton> getFunctionButtonList() {
        return functionButtonList;
    }

    public void setFunctionButtonList(ArrayList<FunctionButton> functionButtonList) {
        this.functionButtonList = functionButtonList;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtonList.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtonList.remove(fb);
    }

    //显示窗口及功能键
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (Object obj : functionButtonList) {
            System.out.println(((FunctionButton) obj).getName());
        }
        System.out.println("------------------------------");
    }

}
