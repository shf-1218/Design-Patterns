package Bridge_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/04/01
 * ConcreteImplementor（具体实现类）：具体实现Implementor接口，在不同的ConcreteImplementor中提供基本操作的不同实现，在程序运行时，ConcreteImplementor
 * 对象将替换其父类对象，提供给抽象类具体的业务操作方法。
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void operationImpl() {

    }
}
