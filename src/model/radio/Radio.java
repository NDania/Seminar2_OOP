package model.radio;

import model.interfaceClass.Sayable;

public class Radio implements Sayable {

    @Override
    public String say() {
        return "Говорит Москва";
    }
}
