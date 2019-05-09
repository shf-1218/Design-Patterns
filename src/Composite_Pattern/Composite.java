package Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongfei.shen
 * @date 2019/04/01
 * Composite
 * （容器构件）：它在组合结构中表示容器节点对象，容器节点包含子节点，其子节点可以是叶子节点，也可以是容器节点，它提供一个集合用于存储子节点，实现了在抽象构件中定义的行为，包括那些访问及管理子构件的方法，在其业务方法中可以递归调用其子节点的业务方法。
 */
public class Composite extends Component {

    public List<Component> list = new ArrayList<>();


    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        for (Component component : list) {
            component.operation();
        }
    }
}
