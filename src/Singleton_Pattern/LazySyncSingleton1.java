package Singleton_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 * 懒汉式(线程安全，同步方法)[不推荐用]
 */
public class LazySyncSingleton1 {
    private static LazySyncSingleton1 lazySyncSingleton;

    private LazySyncSingleton1() {
    }

    public static synchronized LazySyncSingleton1 getInstance() {
        if (lazySyncSingleton == null) {
            lazySyncSingleton = new LazySyncSingleton1();
        }
        return lazySyncSingleton;
    }
}
