import java.lang.reflect.Field;

public class Num4 {
    public static void main(String[] args){

        try{
            Class<?> class1 = Class.forName("Warrior");
            Field[] fields = class1.getDeclaredFields();
            Warrior myWarrior = new Warrior("Conan", 100);

            for (Field f : fields){
                try{
                    f.setAccessible(true);
                    Object val = f.get(myWarrior);
                    System.out.println(f.getName() + ": " + val);

                }
                catch (IllegalAccessException e){
                    System.out.println("Could not access field " + f.getName());
                }
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("Error - class not found.");
        }
    }
}
