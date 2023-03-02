package model.predators;

import model.abstractClass.Predator;
import model.interfaceClass.Runable;

public class Leo extends Predator implements Runable {
    public Leo(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Ррр";
    }


    @Override
    public int getSpeedRun() {
        return 80;
    }
}
