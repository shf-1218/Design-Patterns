package Singleton_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 * 懒汉式(线程安全，同步代码块)[不可用]
 */
public class LazySyncSingleton2 {
    private  static  LazySyncSingleton2 singleton2;

    private LazySyncSingleton2() {
    }

    public static  LazySyncSingleton2 getInstance(){
        if (singleton2==null){
            synchronized (LazySyncSingleton2.class){
                singleton2=new LazySyncSingleton2();
            }
        }
        return singleton2;
    }
}
