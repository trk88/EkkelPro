package lesson1;

/**
 * Created by NotePad.by on 21.04.2015.
 */
public class testStr {
    public static void main(String[] args){
        String s = null;
        try {
            s.toString();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        } finally {
        }
    }
}
