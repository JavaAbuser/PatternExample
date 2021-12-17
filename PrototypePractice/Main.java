package PrototypePractice;

import PrototypePractice.Offices.DirectorOffice;
import PrototypePractice.Offices.Office;
import PrototypePractice.Room.Cabinet;
import PrototypePractice.Room.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Max Steblevskiy(JavaAbuser) on 17.12.2021
 */
public class Main{
    public static void main(String[] args) {
        Cabinet directorCabinet = new Cabinet( // dir cabinet
                Role.DIRECTOR,
                32,
                10);
        Room directorRoom = new Room( // dir room1
                Role.DIRECTOR,
                78,
                directorCabinet);
        Room directorRoom2 = new Room( // dir room2
                Role.DIRECTOR,
                71,
                directorCabinet);

        List<Room> rooms = new ArrayList<>();
        rooms.add(directorRoom);
        rooms.add(directorRoom2);
        Office directorOffice = new DirectorOffice( // dir office
                Role.DIRECTOR,
                5,
                rooms);
        System.out.println("Origin: " + directorOffice);
        System.out.println("Origin: " + directorOffice.getRooms());
        directorOffice.removeRoom(directorRoom);
        System.out.println("Origin: " + directorOffice.getRooms());

        System.out.println("-----------PROTOTYPE-------------");

        Office copedDirectorOffice = directorOffice.copy();
        System.out.println("Clone: " + copedDirectorOffice);
        System.out.println("Clone: " + copedDirectorOffice.getRooms());
        System.out.println("References are equal: " +
                (directorOffice == copedDirectorOffice));
        System.out.println("Modules are equal: " +
                (directorOffice.getRooms() == copedDirectorOffice.getRooms()));
        System.out.println(directorOffice.getRole() == copedDirectorOffice.getRole());
        System.out.println(directorOffice.getEmployeeCount() == copedDirectorOffice.getEmployeeCount());

        System.out.println("-----------CLONEABLE-------------");
        Office clonedByCloneable = directorOffice.clone();
        System.out.println(clonedByCloneable);
        System.out.println("References are equal: " +
                (directorOffice == clonedByCloneable));
        System.out.println("Modules are equal: " +
                (directorOffice.getRooms() == clonedByCloneable.getRooms()));

    }
}
