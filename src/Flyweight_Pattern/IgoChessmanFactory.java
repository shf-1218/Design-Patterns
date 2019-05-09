package Flyweight_Pattern;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hongfei.shen
 * @date 2019/03/26
 * 围棋棋子工厂类：享元工厂类，使用单例模式进行设计
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();

    private static ConcurrentHashMap map;

    public IgoChessmanFactory() {
        map = new ConcurrentHashMap();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        map.put("b", black);
        white = new WhiteIgoChessman();
        map.put("w", white);
    }

    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    public static IgoChessman getIgoChessman(String color) {
        return (IgoChessman) map.get(color);
    }
}

