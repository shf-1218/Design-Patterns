package Prototype_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * Cloneable（抽象原型类）：它是声明克隆方法的接口，是所有具体原型类的公共父类，可以是抽象类也可以是接口，甚至还可以是具体实现类。
 * ConcretePrototype（具体原型类）：它实现在抽象原型类中声明的克隆方法，在克隆方法中返回自己的一个克隆对象。
 */
public class ConcretePrototype implements Cloneable {
    private String attr; //成员属性

    public ConcretePrototype(String attr) {
        this.attr = attr;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    protected ConcretePrototype clone() {
        ConcretePrototype concretePrototype = null;
        try {
            concretePrototype = (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Not support cloneable");
        }
        return concretePrototype;
    }
}
