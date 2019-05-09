package Abstract_Factory_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}
