package AdapterPractice.Adapter;

import AdapterPractice.Airplanes.Boeing;
import AdapterPractice.Airplanes.Embraer;

public class EmbraerAdapter extends Embraer {
    private Boeing boeing;

    public EmbraerAdapter(Boeing boeing) {
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
