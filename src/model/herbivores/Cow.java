package model.herbivores;

import model.abstractClass.Herbivores;
import model.interfaceClass.Flyable;

public class Cow extends Herbivores implements Flyable {
    public Cow(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Мууу";
    }

    @Override
    public int getSpeedFlyable() {
        return 13;
    }

}
