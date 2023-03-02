package model;

import model.abstractClass.Animal;
import model.interfaceClass.Swimmable;
import model.interfaceClass.Flyable;
import model.interfaceClass.Runable;
import model.interfaceClass.Sayable;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animalList = new ArrayList<>();
    Sayable radio;

    public Zoo(List<Object> animals, Sayable talkingObj) {
        List<Animal> animalList = new ArrayList<Animal>();
        this.radio = talkingObj;
        for (Object item: animals) {
            animalList.add((Animal) item);
        }
        this.animalList.addAll(animalList);
        System.out.println(animalList);
    }

    public List<Runable> getRunableList() {
        List<Runable> runableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Runable) {
                runableList.add((Runable) animal);
            }
        }
        return runableList;
    }

    public List<Flyable> getFlyableList() {
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Flyable) {
                flyableList.add((Flyable) animal);
            }
        }
        return flyableList;
    }

    public List<Swimmable> getSwimmableList() {
        List<Swimmable> swimmableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Swimmable) {
                swimmableList.add((Swimmable) animal);
            }
        }
        return swimmableList;
    }

    public Animal getRunChampion(){
        List<Runable> runners = getRunableList();
        Runable champion = runners.get(0);
        for (Runable r : runners){
            if(champion.getSpeedRun() < r.getSpeedRun()){
                champion = r;
            }
        }
        System.out.println("Чемпионом по бегу cо скоростью " + champion.getSpeedRun() + " км/ч стал");
        System.out.println((Animal) champion);
        return (Animal) champion;
    }

    public Animal getFlightChampion(){
        List<Flyable> flyers = getFlyableList();
        Flyable champion = flyers.get(0);
        for (Flyable r : flyers){
            if(champion.getSpeedFlyable() < r.getSpeedFlyable()){
                champion = r;
            }
        }
        System.out.println("Чемпионом по полетам cо скоростью " + champion.getSpeedFlyable() + " км/ч стал");
        System.out.println((Animal) champion);
        return (Animal) champion;
    }

    public Animal getSwimChampion(){
        List<Swimmable> swims = getSwimmableList();
        Swimmable champion = swims.get(0);
        for (Swimmable r : swims){
            if(champion.getSpeedSwim() < r.getSpeedSwim()) {
                champion = r;
            }
        }
        System.out.println("Чемпионом по плаванию со скоростью " + champion.getSpeedSwim() + " км/ч стал");
        System.out.println((Animal) champion);
        return (Animal) champion;
    }

}



