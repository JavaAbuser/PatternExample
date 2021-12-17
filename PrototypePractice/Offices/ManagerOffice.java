package PrototypePractice.Offices;

import PrototypePractice.Role;
import PrototypePractice.Room.Room;

import java.util.List;

public class ManagerOffice implements Office{
    private Role role;
    private int employeeCount;
    private List<Room> managerRooms;

    public ManagerOffice(Role role, int employeeCount, List<Room> managerRooms) {
        this.role = role;
        this.employeeCount = employeeCount;
        this.managerRooms = managerRooms;
    }

    @Override
    public List<Room> getRooms() {
        return managerRooms;
    }

    @Override
    public void addRoom(Room room) {
        managerRooms.add(room);
    }

    @Override
    public void removeRoom(Room room) {
        managerRooms.remove(room);
    }

    @Override
    public Office copy() {
        return new ManagerOffice(this.role,
                this.employeeCount,
                this.managerRooms);
    }

    @Override
    public String toString() {
        return "ManagerOffice{" +
                "role=" + role +
                ", employeeCount=" + employeeCount + "}";
    }

    public Role getRole() {
        return role;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    public ManagerOffice clone() {
        try {
            ManagerOffice clone = (ManagerOffice) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
