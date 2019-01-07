package ru.rzn.sbt.javaschool.basics;
import java.util.Objects;

public class LethalWeapon {
    public String color;
    private int roundsLeft;
    private Double power;
    private static long nextSerial = 0;
    private final long serial;

    public long getSerial() {
        return serial;
    }

    public void reload(int k) {
        roundsLeft += k;
    }

    public void pewPew() {
        roundsLeft -= 2;
    }

    void setPower(Double p) {
        power = p;
    }

    public Double getPower() {
        return power;
    }

    public LethalWeapon() {
        serial = nextSerial;
        nextSerial++;

    }

    public LethalWeapon(String c, Double p, int r) {
        color = c;
        power = p;
        roundsLeft = r;
        serial = nextSerial;
        nextSerial++;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color,power,roundsLeft);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || (this.getClass() != obj.getClass())) return false;
        LethalWeapon other = (LethalWeapon) obj;
        if (other.color.equals(this.color) && other.power.equals(this.power) && (other.roundsLeft == this.roundsLeft)) {
            return true;
        } else {
            return false;
        }
    }

}

