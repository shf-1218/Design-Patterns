package Simple_Factory_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * Factory（工厂角色）：工厂角色即工厂类，它是简单工厂模式的核心，负责实现创建所有产品实例的内部逻辑；工厂类可以被外界直接调用，创建所需的产品对象；在工厂类中提供了静态的工厂方法factoryMethod()
 * ，它的返回类型为抽象产品类型Product。
 */
public class Factory {
    //静态工厂方法
    public static Product createProduct(String type) {
        Product product = null;
        if (type.equalsIgnoreCase("A")) {
            product = new ConcreteProduct();
        }

        return product;
    }
}
