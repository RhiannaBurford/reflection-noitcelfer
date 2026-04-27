import java.lang.reflect.Field;

public class Num4 {
    public static void main(String[] args){

        try{
            Class<?> class1 = Class.forName("Warrior");
            Field[] fields = class1.getDeclaredFields();

            for (Field f : fields){
                System.out.println(f.getName());
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("Error - class not found.");
        }
    }
}
