package Abstract_Factory_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * 界面皮肤工厂接口：抽象工厂
 */
public interface SkinFactory {
    public Button createButton();

    public TextField createTextField();
}
