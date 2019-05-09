package Decorator_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/04/01
 */
public class Client {
    public static void main(String[] args) {
        Component component, componentSB, componentBB; //全部使用抽象构件定义
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB); //将装饰了一次之后的对象继续注入到另一个装饰类中，进行第二次装饰
        componentBB.display();

    }
}
