package singleton;

public class Singleton {
    public String name = "";

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Tut");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
