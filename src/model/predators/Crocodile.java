package model.predators;


import model.interfaceClass.Runable;
import model.interfaceClass.Swimmable;
import model.abstractClass.Predator;


public class Crocodile extends Predator implements Runable, Swimmable {

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Шшш";
    }

    @Override
    public int getSpeedSwim() {
        return 35;
    }

    @Override
    public int getSpeedRun() {
        return 12;
    }
}
