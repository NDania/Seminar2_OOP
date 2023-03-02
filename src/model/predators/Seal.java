package model.predators;

import model.abstractClass.Predator;
import model.interfaceClass.Swimmable;

public class Seal extends Predator implements Swimmable{

    public Seal(String name) {
        super(name);
    }

    public int getSpeedSwim() {
        return 26;
    }

    @Override
    public String feed() {
        return "fish";
    }

    @Override
    public String say() {
        return "a-a-a";
    }
}