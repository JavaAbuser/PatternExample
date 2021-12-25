package AdapterPractice.Pilots;

import AdapterPractice.Airplanes.Embraer;

public class EmbraerPilot {
    private Embraer embraer;

    public EmbraerPilot(Embraer embraer) {
        this.embraer = embraer;
    }

    public void controlAirplane(){
        System.out.println("embraer pilot can control current airplane");
    }
}
