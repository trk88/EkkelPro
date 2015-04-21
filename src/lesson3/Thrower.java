package lesson3;

import lesson2.MyExeption;

/**
 * Created by NotePad.by on 21.04.2015.
 */
public class Thrower {
    public void f() throws MyExeption{
        throw new MyExeption("Inside f()");
    }
}
