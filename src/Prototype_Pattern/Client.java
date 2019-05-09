package Prototype_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype("a");

        ConcretePrototype cloneConcretePrototype = concretePrototype.clone();

        System.out.println(concretePrototype.equals(cloneConcretePrototype));

        System.out.println(concretePrototype.getAttr().equalsIgnoreCase(cloneConcretePrototype.getAttr()));

        System.out.println(concretePrototype.getClass().equals(cloneConcretePrototype.getClass()));
    }
}
