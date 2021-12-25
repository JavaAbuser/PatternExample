package AdapterPractice.Adapter;

import AdapterPractice.Airplanes.Airbus;
import AdapterPractice.Airplanes.Boeing;

public class AirbusAdapter extends Airbus {
    private Boeing boeing;

    public AirbusAdapter(Boeing boeing) {
        this.boeing = boeing;
    }

    public void startEngine(){
        boeing.startLeftEngine();
        boeing.startRightEngine();
    }

    public void goToRunWay(){
        boeing.goToRunWay();
    }

    public void takeOff(){
        boeing.takeOff();
    }

}
