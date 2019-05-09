package Singleton_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 * 饿汉式（静态常量）[可用]
 */
public class EagerSingleton {
    //饿汉式是典型的空间换时间
    public static EagerSingleton singleton = new EagerSingleton();

    /**
     * 私有默认构造子
     */
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return singleton;
    }

}
