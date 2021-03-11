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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a weight: ");
        double weight = input.nextDouble();
        System.out.println("On Mercury you have this weight : " + weight * MERCURY.ratio);
        System.out.println("On Venus you have this weight : " + weight * VENUS.ratio);
        System.out.println("On Moon you have this weight : " + weight * MOON.ratio);
        System.out.println("On Mars you have this weight : " + weight * MARS.ratio);
        System.out.println("On Jupiter you have this weight : " + weight * JUPITER.ratio);
        System.out.println("On Saturn you have this weight : " + weight * SATURN.ratio);
        System.out.println("On Uranus you have this weight : " + weight * URANUS.ratio);
        System.out.println("On Neptune you have this weight : " + weight * NEPTUNE.ratio);
        System.out.println("On Pluto you have this weight : " + weight * PLUTO.ratio);
        System.out.println("On IO you have this weight : " + weight * IO.ratio);
        System.out.println("On Europa you have this weight : " + weight * EUROPA.ratio);
        System.out.println("On Ganymede you have this weight : " + weight * GANYMEDE.ratio);
        System.out.println("On Callisto you have this weight : " + weight * CALLISTO.ratio);
        System.out.println("On Sun you have this weight : " + weight * SUN.ratio);
        System.out.println("On White Dwarf you have this weight : " + weight * WHITE_DWARF.ratio);

    }

    public double getRatio() {
        return ratio;
    }
}
