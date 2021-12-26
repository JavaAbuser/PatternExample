package BridgePractice;

import BridgePractice.Disks.Disk;
import BridgePractice.Disks.HDD;
import BridgePractice.Disks.Kingstone;
import BridgePractice.Games.Deceit;
import BridgePractice.Games.Dota;
import BridgePractice.Games.FarCry;
import BridgePractice.Games.Game;

/**
 * @author Max Steblevskiy(JavaAbuser) on 26.12.21
 */

public class Main {
    public static void main(String[] args) {
        Disk hdd = new HDD(); // memory 200
        Game deceit = new Deceit("Deceit"); // memory 24
        deceit.download(hdd);

        System.out.println("-------------");
        Disk kingstone = new Kingstone(); // memory 10
        Game dota = new Dota("Dota"); // memory 34
        dota.download(kingstone);

        System.out.println("-------------");
        Disk hdd2 = new HDD();
        Game farCry = new FarCry("FarCry");
        farCry.download(hdd2);
    }
}
