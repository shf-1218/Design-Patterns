package Simple_Factory_Pattern.example;

import utils.XMLUtil;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 */
public class Client {
    public static void main(String[] args) {
        String chartType = XMLUtil.getNodeName("chartType");
        Chart chart = ChartFactory.createChart(chartType);
        chart.dispaly();
    }
}
