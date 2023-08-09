package SingletonPattern;

/**
 * @Author
 * @Date 2023-08-09-2:56 pm
 */
public class Singleton_Eager {
    private static Singleton_Eager instance = new Singleton_Eager();
    private Singleton_Eager (){}
    public static Singleton_Eager getInstance() {
        return instance;
    }
}
