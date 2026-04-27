import java.lang.reflect.Method;

public class Num9 {

    public static void main(String[] args){

        try {
            Class<?> c1 = Class.forName("Warrior");
            Method[] methods = c1.getMethods();

            for (Method m : methods){
                Class<?>[] parameters = m.getParameterTypes();
                for (Class<?> p : parameters){
                    System.out.println("Parameter: " + p.getName());
                }
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("Error - class not found!");
        }
    }
}
