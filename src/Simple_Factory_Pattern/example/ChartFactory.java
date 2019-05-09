package Simple_Factory_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 * 图表工厂类：工厂类
 */
public class ChartFactory {

    public static Chart createChart(String chartType) {
        Chart chart = null;
        if ("histogram".equalsIgnoreCase(chartType)) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        }
        if ("pie".equalsIgnoreCase(chartType)) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");
        }
        if ("line".equalsIgnoreCase(chartType)) {
            chart = new PieChart();
            System.out.println("初始化设置折线图！");
        }
        return chart;
    }
}
