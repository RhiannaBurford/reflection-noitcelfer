import java.lang.reflect.Method;

public class Num1 {

    // First of all, you need to get the class using Class.forName
    // This is risky so you need a try-catch block

    public static void main(String[] args){
        try{
            Class<?> warriorClass = Class.forName("Warrior");
        }
        catch (ClassNotFoundException e){
            System.out.println("Class does not exist.");
        }

        String target = "java.lang.String";

        try{
            Class<?> class1 = Class.forName(target);
            Method[] methods = class1.getDeclaredMethods();
            for (Method m : methods){
                System.out.println(m.toString());
            }

        }
        catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }

    }
    
}
