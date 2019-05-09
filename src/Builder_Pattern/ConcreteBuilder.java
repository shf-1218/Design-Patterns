package Builder_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * ConcreteBuilder（具体建造者）：它实现了Builder接口，实现各个部件的具体构造和装配方法，定义并明确它所创建的复杂对象，也可以提供一个方法返回创建好的复杂产品对象。
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void builderPartA() {
        this.product.setPartA("A");
    }

    @Override
    public void builderPartB() {
        this.product.setPartB("B");
    }

    @Override
    public void builderPartC() {
        this.product.setPartC("C");
    }

    @Override
    public void builderPartD() {
        this.product.setPartD("D");
    }
}
