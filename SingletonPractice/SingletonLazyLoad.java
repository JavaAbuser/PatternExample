package SingletonPractice;

public class SingletonLazyLoad {
    private static SingletonLazyLoad instance = new SingletonLazyLoad();

    private SingletonLazyLoad() {
    }

    public static SingletonLazyLoad getInstance(){
        if(instance == null){ // will not be work
            instance = new SingletonLazyLoad();
        }
        return instance;
    }
}
