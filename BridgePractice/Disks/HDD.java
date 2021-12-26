package BridgePractice.Disks;

import BridgePractice.Games.Game;

public class HDD implements Disk{
    private int volume = 200;
    private Game game;
    
    @Override
    public int getVolume() {
        return volume;
    }
}
