package Simple_Factory_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * 柱状图类：具体产品类
 */
public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    @Override
    public void dispaly() {
        System.out.println("显示柱状图！");
    }
}
