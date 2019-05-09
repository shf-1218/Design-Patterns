package Decorator_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/26
 * 文本框类：具体构件类
 */
public class TextBox extends Component {
    @Override
    public void display() {
        System.out.println("显示文本框！");
    }
}
