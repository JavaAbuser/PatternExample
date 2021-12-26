package BridgePractice.Games;

import BridgePractice.Disks.Disk;

public class Dota implements Game{
    private String name;
    private int memoryVolume = 34;
    private Disk disk;

    public Dota(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void download(Disk disk) {
        if(memoryVolume <= disk.getMemoryVolume()){
            this.disk = disk;
            System.out.println(name + " was successfully downloaded!");
        } else {
            System.out.println("There are not enough memory to download " + name);
        }
    }
}
