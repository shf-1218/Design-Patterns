package Adapter_Pattern.object;

/**
 * @author hongfei.shen
 * @date 2019/03/21
 * Adapter（适配器类）：适配器可以调用另一个接口，作为一个转换器，对Adaptee和Target进行适配，
 * 适配器类是适配器模式的核心，在对象适配器中，它通过继承Target并关联一个Adaptee对象使二者产生联系。
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    @Override
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {

    }
}
