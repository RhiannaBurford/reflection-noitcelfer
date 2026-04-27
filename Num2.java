import java.lang.reflect.Method;


public class Num2 {
    public static void main(String[] args){
        try{
            Class<?> warriorClass = Class.forName("Warrior");
            Method[] methods = warriorClass.getDeclaredMethods();
            for (Method m : methods){
                System.out.println("Name: " + m.getName());
                System.out.println("Return type: " + m.getReturnType().getName());
                Class<?>[] parameters = m.getParameterTypes();
                System.out.println("Parameters: ");
                for (int i = 0; i < parameters.length; i++){
                    System.out.print(parameters[i].getName() + " ");
                }
                System.out.println("");
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("Class does not exist.");
        }

    }
}
