package Singleton_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 * 懒汉式(线程不安全)[不可用]
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    /**
     * 私有默认构造子
     */
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
