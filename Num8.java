import java.lang.reflect.Method;

public class Num8 {

    public static void main(String[] args){

        try {
            Class<?> c1 = Class.forName("Warrior");
            Method[] methods = c1.getDeclaredMethods();

            for (Method m : methods){
                System.out.println("Return type: " + m.getReturnType().getName());
                System.out.println("Method name: " + m.getName() + "\n");
    
            }

        }
        catch (ClassNotFoundException e){
            System.out.println("Error - class not found!");
        }
    }

}
