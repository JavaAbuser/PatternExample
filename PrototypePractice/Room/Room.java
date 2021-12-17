package PrototypePractice.Room;

import PrototypePractice.Role;

public class Room {
    private int number;
    private Role role;
    private Cabinet cabinet;

    public Room(Role role, int number, Cabinet cabinet) {
        this.role = role;
        this.number = number;
        this.cabinet = cabinet;
    }


    public Role getRole() {
        return role;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", role=" + role +
                ", cabinet=" + cabinet +
                '}';
    }
}
