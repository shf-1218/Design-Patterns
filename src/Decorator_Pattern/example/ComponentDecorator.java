package Decorator_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/26
 * 构件装饰类：抽象装饰类
 */
public class ComponentDecorator extends Component {
    private Component component; //维持对抽象构件类型对象的引用

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void setComponent(Component component) {//注入抽象构件类型的对象
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
