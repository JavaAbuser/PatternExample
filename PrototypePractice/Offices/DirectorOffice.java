package PrototypePractice.Offices;

import PrototypePractice.Role;
import PrototypePractice.Room.Room;

import java.util.List;

public class DirectorOffice implements Office{
    private Role role;
    private int employeeCount;
    private List<Room> directorRooms;

    public DirectorOffice(Role role, int employeeCount, List<Room> directorRooms) {
        this.role = role;
        this.employeeCount = employeeCount;
        this.directorRooms = directorRooms;
    }

    @Override
    public void addRoom(Room room) {
        directorRooms.add(room);
    }

    @Override
    public void removeRoom(Room room) {
        directorRooms.remove(room);
    }

    @Override
    public Office copy() {
        return new DirectorOffice(this.role,
                this.employeeCount,
                this.directorRooms);
    }

    @Override
    public List<Room> getRooms() {
        return directorRooms;
    }

    @Override
    public String toString() {
        return "DirectorOffice{" +
                "role=" + role +
                ", employeeCount=" + employeeCount + "}";
    }

    public Role getRole() {
        return role;
    }

    @Override
    public Office clone() {
        Office clonedDirectorOffice =
                new DirectorOffice(this.role, this.employeeCount,this.directorRooms);
        return clonedDirectorOffice;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }


}
