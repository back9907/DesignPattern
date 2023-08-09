package SingletonPattern;

/**
 * @Author
 * @Date 2023-08-09-2:55 pm
 */
public class Singleton_Concurrent_Lazy {
    private static Singleton_Concurrent_Lazy instance;
    private Singleton_Concurrent_Lazy (){}
    public static synchronized Singleton_Concurrent_Lazy getInstance() {
        if (instance == null) {
            instance = new Singleton_Concurrent_Lazy();
        }
        return instance;
    }
}
