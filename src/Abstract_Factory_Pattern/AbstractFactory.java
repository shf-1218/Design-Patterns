package Abstract_Factory_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * AbstractFactory（抽象工厂）：它声明了一组用于创建一族产品的方法，每一个方法对应一种产品
 */
public abstract class AbstractFactory {

    public abstract AbstractProductA createProductA();//工厂方法一

    public abstract AbstractProductB createProductB();//工厂方法二
}
