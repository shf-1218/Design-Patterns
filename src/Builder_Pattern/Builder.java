package Builder_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * Builder（抽象建造者）：它为创建一个产品Product对象的各个部件指定抽象接口，在该接口中一般声明两类方法，一类方法是buildPartX()，它们用于创建复杂对象的各个部件；另一类方法是getResult()
 * ，它们用于返回复杂对象。Builder既可以是抽象类，也可以是接口。
 *
 */
public abstract class Builder {
    Product product = new Product();

    public abstract void builderPartA();

    public abstract void builderPartB();

    public abstract void builderPartC();

    public abstract void builderPartD();

    public Product getProduct() {
        builderPartA();
        builderPartB();
        builderPartC();
        builderPartD();
        return product;
    }
}
