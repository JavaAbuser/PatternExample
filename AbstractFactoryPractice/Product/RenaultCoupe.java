package AbstractFactoryPractice.Product;

public class RenaultCoupe implements Coupe{
    public RenaultCoupe() {
        System.out.println("Renault coupe was created");
    }

    @Override
    public void doorCount() {
        System.out.println("Renault has 2 doors");
    }
}
