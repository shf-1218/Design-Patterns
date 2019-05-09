package Abstract_Factory_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * Summer文本框类：具体产品
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}
