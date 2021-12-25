package AdapterPractice;

import AdapterPractice.Adapter.AirbusAdapter;
import AdapterPractice.Adapter.EmbraerAdapter;
import AdapterPractice.Airplanes.Airbus;
import AdapterPractice.Airplanes.Boeing;
import AdapterPractice.Pilots.AirbusPilot;
import AdapterPractice.Pilots.EmbraerPilot;

/**
 * @author Max Steblevskiy(JavaAbuser) on 25.12.21
 */
public class Main {
    public static void main(String[] args) {
        // Airbus pilot in Airbus airplane
        Airbus airbus = new Airbus();
        AirbusPilot airbusPilot = new AirbusPilot(airbus);
        airbusPilot.controlAirplane();
        airbus.startEngine();
        airbus.goToRunWay();
        airbus.takeOff();

        System.out.println("-----------------------");
        // Airbus pilot in Boeing airplane
        Boeing boeing = new Boeing();
        AirbusAdapter airbusAdapter = new AirbusAdapter(boeing);
        AirbusPilot airbusPilot1 = new AirbusPilot(airbusAdapter);
        airbusPilot1.controlAirplane();
        airbusAdapter.startEngine();
        airbusAdapter.goToRunWay();
        airbusAdapter.takeOff();

        System.out.println("-----------------------");
        // Embraer pilot in Boeing airplane
        Boeing boeing1 = new Boeing();
        EmbraerAdapter embraerAdapter = new EmbraerAdapter(boeing1);
        EmbraerPilot embraerPilot = new EmbraerPilot(embraerAdapter);
        embraerPilot.controlAirplane();
        boeing1.startRightEngine();
        boeing1.startLeftEngine();
        boeing1.goToRunWay();
        boeing1.takeOff();

    }
}
