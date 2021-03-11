package ro.fasttrackit.curs2.interfaces;

public interface Pet {

    String NAME = "PET";

    String getName();

    String makeSound();

    default String phrase(){
        return getName() + ":" + makeSound();
    }
    default String getColour(){
        return "Brown";
    }

}
