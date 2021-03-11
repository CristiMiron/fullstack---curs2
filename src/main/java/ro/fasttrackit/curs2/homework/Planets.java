package ro.fasttrackit.curs2.homework;

import java.util.Scanner;

public enum Planets {
    MERCURY(0.3),
    VENUS(0.9),
    MOON(0.1),
    MARS(0.3),
    JUPITER(2.5),
    SATURN(1),
    URANUS(0.8),
    NEPTUNE(1.1),
    PLUTO(0),
    IO(0.18),
    EUROPA(0.13),
    GANYMEDE(0.14),
    CALLISTO(0.12),
    SUN(27),
    WHITE_DWARF(1300000);

    private final double ratio;

    Planets(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a weight: ");
        double weight = input.nextDouble();

        for (Planets planets : Planets.values())
            System.out.printf("Your weight on %s is %f%n", planets, planets.ratio * weight);

    }

}
