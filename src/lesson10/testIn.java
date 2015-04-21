package lesson10;


import java.io.IOException;

public class testIn {
    public static void main(String[] args){
   int x;
        try{
            x = System.in.read();
            char c = (char)x;
            System.out.println("Symbol code"+c+ " ="+x);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
