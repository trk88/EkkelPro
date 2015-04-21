package lesson3;

import lesson2.MyExeption;

/**
 * Created by NotePad.by on 21.04.2015.
 */
public class test8 {
    public static void main(String[] args){
        Thrower thrower = new Thrower();
        try {
            thrower.f();
        } catch (MyExeption myExeption) {
            myExeption.printMsg();
        }
    }
}
