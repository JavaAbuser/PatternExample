package AdapterPractice.Pilots;

import AdapterPractice.Airplanes.Airbus;

public class AirbusPilot {
    private Airbus airbus;

    public AirbusPilot(Airbus airbus) {
        this.airbus = airbus;
    }

    public void controlAirplane(){
        System.out.println("airbus pilot can control current airplane");
    }
}
