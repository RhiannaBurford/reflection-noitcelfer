import java.lang.reflect.*;

public class Num15 {
    public static void main(String[] args) {
        try {
            // 1. Get the Class 'Smartphone'
            Class<?> clazz = Class.forName("Smartphone");

            // 2. Create the instance 'myPhone'
            Object myPhone = clazz.getDeclaredConstructor().newInstance();

            // 3. Define the parameters (String and long)
            // Slide 13: We need to specify the "signature"
            Class<?>[] params = new Class[] { String.class, long.class };

            // 4. Get the method 'sendSMS' with those parameters
            Method m = clazz.getDeclaredMethod("sendSMS", params);

            // 5. Invoke 'sendSMS' on 'myPhone' with "Hello" and 5551234L
            m.invoke(myPhone, "Hello", 5551234L);

            // 6. Get the private field 'modelName'
            Field f = clazz.getDeclaredField("modelName");
            
            // 7. Use the "Skeleton Key" and GET the value
            f.setAccessible(true);
            Object name = f.get(myPhone);

            System.out.println("Model: " + name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}