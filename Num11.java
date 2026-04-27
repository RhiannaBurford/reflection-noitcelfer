import java.lang.reflect.*;

public class Num11 {
    public static void main(String[] args) {
        
        try {
            // 1. Get the class blueprint for "Safe"
            Class<?> clazz = Class.forName("Safe");

            // 2. Create the instance
            Object mySafe = clazz.getDeclaredConstructor().newInstance();

            // 3. THE SKELETON KEY: Access the private field "pinCode"
            Field f = clazz.getDeclaredField("pinCode");
            f.setAccessible(true); // Enable access to private
            f.set(mySafe, 9999); // Set the new pin

            // 4. THE INVOCATION: Call the "lock" method (takes no parameters)
            // Since it takes no parameters, the Class array is empty or null
            Method m = clazz.getDeclaredMethod("lock");
            m.invoke(mySafe);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}