import view.View;
import model.Zoo;
import model.herbivores.Cow;
import model.herbivores.Duck;
import model.herbivores.Goat;
import model.predators.Crocodile;
import model.predators.Leo;
import model.predators.Seal;
import model.radio.Radio;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> animalsList = List.of(
                new Cow("Корова Мурка"),
                new Crocodile("Крокодил Гена"),
                new Leo("Лев Симба - Леопольд"),
                new Goat("Коза Маруська"),
                new Duck("Утка Дональд Дак"),
                new Seal("Тюлень Матильда")

        );
        Zoo zoo = new Zoo(animalsList, new Radio());

        View.printZoo(animalsList);
        View.printChampion(zoo.getRunChampion());
        View.printChampion(zoo.getFlightChampion());
        View.printChampion(zoo.getSwimChampion());
    }
}