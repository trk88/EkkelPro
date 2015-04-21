package lesson2;


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
