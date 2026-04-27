import java.lang.reflect.Field;

public class Num6 {
    public static void main(String[] args){

        try {
            Class<?> potionClass = Class.forName("HealthPotion");
            Field[] fields = potionClass.getDeclaredFields();

            for (Field f : fields){
                System.out.println(f.getName());
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("Error - class not found!");
        }
    }
}
