package model.herbivores;

import model.abstractClass.Herbivores;
import model.interfaceClass.Runable;

public class Goat extends Herbivores implements Runable {
    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Меее";
    }

    @Override
    public int getSpeedRun() {
        return 12;
    }
}
