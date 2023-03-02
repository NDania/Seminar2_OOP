package model.abstractClass;

import model.interfaceClass.Flyable;
import model.interfaceClass.Runable;
import model.interfaceClass.Sayable;
import model.interfaceClass.Swimmable;

public abstract class Animal implements Sayable {

    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String feed();

    @Override
   public String toString() {

        return String.format("%s", this.name);
    }
}
