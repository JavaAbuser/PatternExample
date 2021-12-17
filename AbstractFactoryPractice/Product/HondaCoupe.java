package AbstractFactoryPractice.Product;

public class HondaCoupe implements Coupe{
    public HondaCoupe() {
        System.out.println("Honda coupe was created");
    }

    @Override
    public void doorCount() {
        System.out.println("Honda has 2 doors");
    }
}
