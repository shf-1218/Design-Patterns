package Singleton_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 * 静态内部类[推荐用]
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class SingletonInstance {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
