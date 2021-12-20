package SingletonPractice;

/**
 * @author Max Steblevskiy(JavaAbuser) on 20.12.2021
 */
public class Main {
    public static void main(String[] args) {
        Singleton unique = Singleton.getInstance();
        unique.setValue(20);
        System.out.println(unique);
        System.out.println("Unique value is: " + unique.getValue());

        Singleton notUnique = Singleton.getInstance();
        System.out.println(notUnique);
        System.out.println("Not Unique value is: " + notUnique.getValue());
        System.out.println(unique == notUnique);

        System.out.println("Instance with lazy load initializing: " + SingletonLazyLoad.getInstance());
        SingletonLazyLoad singletonLazyLoad = SingletonLazyLoad.getInstance();
        System.out.println(singletonLazyLoad == SingletonLazyLoad.getInstance());

    }
}
