import singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.name = "Vitali";
        System.out.println(singleton2.name); // Vitali
    }
}
