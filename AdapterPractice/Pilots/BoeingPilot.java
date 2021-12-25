package AdapterPractice.Pilots;

import AdapterPractice.Airplanes.Boeing;

public class BoeingPilot {
    private Boeing boeing;

    public BoeingPilot(Boeing boeing) {
        this.boeing = boeing;
    }

    public void controlAirplane(){
        System.out.println("boeing pilot can control current airplane");
    }
}
