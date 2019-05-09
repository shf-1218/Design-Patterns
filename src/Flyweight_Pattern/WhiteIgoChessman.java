package Flyweight_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/26
 * 白色棋子类：具体享元类
 */
public class WhiteIgoChessman extends IgoChessman {
    @Override
    public String getColor() {
        return "白色";
    }
}
