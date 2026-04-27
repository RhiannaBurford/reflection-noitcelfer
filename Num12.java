import java.lang.reflect.*;

public class Num12 {
    public static void main(String[] args) {
        try {
            // 1. Get the class blueprint
            Class<?> clazz = Class.forName("Potion");

            // 2. Create the object
            Object myPotion = clazz.getDeclaredConstructor().newInstance();

            // 3. Define the parameter "Shape" (String and int)
            // Slide 13: This tells Java which version of the method to find
            Class<?>[] types = new Class[] { String.class, int.class };

            // 4. Get the "mix" method
            Method m = clazz.getDeclaredMethod("mix", types);

            // 5. Invoke the method with data: "Dragon Root" and 5
            // Store the result in an Object since we don't know the exact type
            Object result = m.invoke(myPotion, "Dragon Root", 5);

            // 6. Print the result
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Error occurred!");
        }
    }
}