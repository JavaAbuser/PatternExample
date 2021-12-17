package AbstractFactoryPractice.Product;

public class RenaultSedan implements Sedan{
    public RenaultSedan(){
        System.out.println("Renault sedan was created");
    }

    @Override
    public void doorCount() {
        System.out.println("Renault has 4 doors");
    }
}
