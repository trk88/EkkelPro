package lesson2;

/**
 * Created by NotePad.by on 21.04.2015.
 */
public class MyExeption extends Exception{
    String msg;
    public MyExeption(String msg){
        this.msg = msg;
    }
    public void printMsg(){
        System.out.println("message = "+msg);
    }
}
