package model.herbivores;

import model.abstractClass.Herbivores;
import model.interfaceClass.Swimmable;
import model.interfaceClass.Flyable;
import model.interfaceClass.Runable;

public class Duck extends Herbivores implements Flyable, Runable, Swimmable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Кря-Кря";
    }

    @Override
    public int getSpeedFlyable() {
        return 115;
    }

    @Override
    public int getSpeedRun()
    {
        return 60;
    }

    @Override
    public int getSpeedSwim() {
        return 24;
    }

}
