package BridgePractice.Disks;

import BridgePractice.Games.Game;

public class Kingstone implements Disk{
    private int volume = 10;
    private Game game;

    public int getVolume() {
        return volume;
    }

    @Override
    public int getMemoryVolume() {
        return volume;
    }
}
