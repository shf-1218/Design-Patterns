package Singleton_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 * 饿汉式（静态代码块）[可用]
 */
public class EagerSyncSingleton {
    private static EagerSyncSingleton syncSingleton;

    static {
        syncSingleton = new EagerSyncSingleton();
    }

    private EagerSyncSingleton() {
    }

    public static EagerSyncSingleton getInstance() {
        return syncSingleton;
    }
}
