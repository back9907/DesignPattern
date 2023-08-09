package SingletonPattern;

/**
 * @Author
 * @Date 2023-08-09-2:57 pm
 */
public class Singleton_DCL {
    private volatile static Singleton_DCL singleton;
    private Singleton_DCL (){}
    public static Singleton_DCL getSingleton() {
        if (singleton == null) {
            synchronized (Singleton_DCL.class) {
                if (singleton == null) {
                    singleton = new Singleton_DCL();
                }
            }
        }
        return singleton;
    }
}
