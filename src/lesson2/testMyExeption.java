package lesson2;

/**
 * Created by NotePad.by on 21.04.2015.
 */
public class testMyExeption {
    public static void main(String[] args){
        try {
            throw new MyExeption("myExeption");
        } catch (MyExeption myExeption) {
            myExeption.printMsg();
        } finally {
        }
    }
}
