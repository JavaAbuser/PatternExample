package AbstractFactoryPractice.Product;

public class HondaSedan implements Sedan{
    public HondaSedan(){
        System.out.println("Honda sedan was created");
    }

    @Override
    public void doorCount() {
        System.out.println("Honda has 4 doors");
    }
}
