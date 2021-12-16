package BuilderPractice.Builder;

public class Director {
    public void createOldCar(CarBuilder builder){
        builder
                .setName("Mitsubishi")
                .setPrice(700)
                .setYear(1998);
    }
    public void createSportCar(CarBuilder builder){
        builder
                .setName("Lamborghini")
                .setPrice(40_000)
                .setYear(2016);
    }
}
