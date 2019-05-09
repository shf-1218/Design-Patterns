package Simple_Factory_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * 饼状图类：具体产品类
 */
public class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图！");
    }

    @Override
    public void dispaly() {
        System.out.println("显示饼状图！");
    }
}
