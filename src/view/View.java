package view;

import model.abstractClass.Animal;
import model.interfaceClass.Swimmable;
import model.interfaceClass.Flyable;
import model.interfaceClass.Runable;



import java.util.List;

public class View {
    public static void printChampion(Animal animal) {
        System.out.println("-------------------------------------------");

    }


    public static void printZoo(List<Object> listAnimals) {
        for (Object animal : listAnimals) {
            System.out.println(((Animal) animal).getName());
            System.out.println("Говорит: " + ((Animal) animal).say());
            System.out.println("Ест: " + ((Animal) animal).feed());
            if (animal instanceof Runable) {
                System.out.println("Скорость бега: " + ((Runable) animal).getSpeedRun() +" км/ч");
            }
            if (animal instanceof Flyable) {
                System.out.println("Скорость полёта: " + ((Flyable) animal).getSpeedFlyable() +" км/ч");
            }
            if (animal instanceof Swimmable) {
                System.out.println("Скорость плавания: " + ((Swimmable) animal).getSpeedSwim() +" км/ч");
            }
            System.out.println("--------------------------");
        }
        System.out.println("\n");
    }
}
