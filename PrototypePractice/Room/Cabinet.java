package PrototypePractice.Room;

import PrototypePractice.Role;

public class Cabinet{
    private int number;
    private int spot;
    private Role role;

    public Cabinet(Role role, int number, int spot) {
        this.spot = spot;
        this.role = role;
        this.number = number;
    }

    public int getSpot() {
        return spot;
    }

    public Role getRole() {
        return role;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "number=" + number +
                ", spot=" + spot +
                ", role=" + role +
                '}';
    }
}
