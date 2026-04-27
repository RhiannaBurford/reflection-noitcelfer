import java.lang.reflect.*;

public class Num12 {
    public static void main(String[] args) {
        try {
            // 1. Get the Class for "Robot"
            Class<?> clazz = Class.forName("Robot");

            // 2. Create the instance (get constructor then new instance)
            Object myBot = clazz.getDeclaredConstructor().newInstance();

            // 3. Get the PRIVATE field "batteryLevel"
            Field f = clazz.getDeclaredField("batteryLevel");
            
            // 4. Use the "Skeleton Key" on the field
            f.setAccessible(true);
            
            // 5. Set the batteryLevel to 100 on myBot
            f.set(myBot, 100);

            // 6. Get the method "charge" (no parameters)
            Method m = clazz.getDeclaredMethod("charge");

            // 7. Run the method on myBot
            m.invoke(myBot);

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}