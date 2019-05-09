package Abstract_Factory_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}
