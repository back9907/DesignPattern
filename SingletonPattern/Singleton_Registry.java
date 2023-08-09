package SingletonPattern;

/**
 * @Author
 * @Date 2023-08-09-6:01 pm
 */
public class Singleton_Registry {
    private static class SingletonHolder {
        private static final Singleton_Registry INSTANCE = new Singleton_Registry();
    }
    private Singleton_Registry (){}
    public static final Singleton_Registry getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
