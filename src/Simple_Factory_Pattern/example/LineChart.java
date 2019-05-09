package Simple_Factory_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 */
public class LineChart implements Chart {
    public LineChart() {
        System.out.println("创建折现图！");
    }

    @Override
    public void dispaly() {
        System.out.println("显示折线图！");
    }
}
