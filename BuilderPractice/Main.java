package BuilderPractice;

import BuilderPractice.Cars.ElectricCar;
import BuilderPractice.Builder.Director;
import BuilderPractice.Cars.OldCar;
import BuilderPractice.Cars.SportCar;
import BuilderPractice.Product.Car;

/**
 * @author Max Steblevskiy(Java Abuser) on 16.12.2021
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\tCreating oldCar:");
        OldCar oldCar = new OldCar();
        Director director = new Director();
        director.createOldCar(oldCar);
        Car car = oldCar.getResult();
        System.out.println(car);

        System.out.println("\tCreating sportCar:");
        SportCar sportCar = new SportCar();
        Director director1 = new Director();
        director1.createSportCar(sportCar);
        Car car1 = sportCar.getResult();
        System.out.println(car1);

        System.out.println("\tCreating electricCar:");
        ElectricCar electricCar = new ElectricCar();
        electricCar
                .setName("Tesla")
                .setPrice(25_000)
                .setYear(2018);
        Car car2 = electricCar.getResult();
        System.out.println(car2);
    }
}
