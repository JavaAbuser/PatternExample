package PrototypePractice.Offices;

import PrototypePractice.Role;
import PrototypePractice.Room.Room;

import java.util.List;

public class ProgrammerOffice implements Office{
    private Role role;
    private int employeeCount;
    private List<Room> programmerRooms;


    public ProgrammerOffice(Role role, int employeeCount, List<Room> programmerRooms) {
        this.role = role;
        this.employeeCount = employeeCount;
        this.programmerRooms = programmerRooms;
    }

    @Override
    public List<Room> getRooms() {
        return programmerRooms;
    }

    @Override
    public void addRoom(Room room) {
        programmerRooms.add(room);
    }

    @Override
    public void removeRoom(Room room) {
        programmerRooms.remove(room);
    }

    @Override
    public Office copy() {
        return new ProgrammerOffice(this.role,
                this.employeeCount,
                this.programmerRooms);
    }

    @Override
    public String toString() {
        return "ProgrammerOffice{" +
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
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public ProgrammerOffice clone() {
        try {
            ProgrammerOffice clone = (ProgrammerOffice) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

