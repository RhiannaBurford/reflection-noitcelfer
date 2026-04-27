import java.lang.reflect.Method;

public class Num7 {
    public static void main(String[] args){
        try {
            Class<?> c1 = Class.forName("Warrior");
            Method[] methods = c1.getDeclaredMethods();
            for (Method m : methods){
                System.out.println(m.getName());
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("ERROR! Class not found. ");
        }
    }
}
