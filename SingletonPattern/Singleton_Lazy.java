package SingletonPattern;

/**
 * @Author
 * @Date 2023-08-09-2:54 pm
 */
public class Singleton_Lazy {
    private static Singleton_Lazy instance;
    private Singleton_Lazy (){}

    public static Singleton_Lazy getInstance() {
        if (instance == null) {
            instance = new Singleton_Lazy();
        }
        return instance;
    }
}
