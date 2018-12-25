package ru.rzn.sbt.javaschool.basics;

public class LethalWeapon {
    public String color;
    private int roundsLeft;
    private Double power;
    private static long nextSerial;
    private final long SERIAL=2;

    public long getSerial(){
        return SERIAL;
    }

    public void reload(int k) {
        roundsLeft = roundsLeft + k;
    }

    public void pewPew() {
        roundsLeft = roundsLeft - 2;
    }

    void setPower(Double p) {
        power = p;
    }

    public Double getPower() {
        return power;
    }

    public LethalWeapon() {
        nextSerial=0;
    }

    public LethalWeapon(String c, Double p, int r) {
        color = c;
        power = p;
        roundsLeft = r;
        nextSerial=0;
    }
    public boolean equals(String c, Double p, int r) {
        return ( c.equals(color) &  p.equals(power) & (roundsLeft==r));

    }
}

