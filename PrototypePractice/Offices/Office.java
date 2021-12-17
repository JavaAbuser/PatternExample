package PrototypePractice.Offices;

import PrototypePractice.Role;
import PrototypePractice.Room.Room;

import java.util.List;

public interface Office extends Cloneable{
    List<Room> getRooms();
    void addRoom(Room room);
    void removeRoom(Room room);
    Office copy();
    int getEmployeeCount();
    Role getRole();
    abstract Office clone();
}
