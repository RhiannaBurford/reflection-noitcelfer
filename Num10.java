import java.lang.reflect.*;

public class Num10 {
    public static void main(String[] args) throws Exception {
        
        // 1. Get the class blueprint for "SecretDoor"
        Class<?> doorClass = Class.forName("SecretDoor");

        // 2. Create the instance (The Target Object)
        // First we get the constructor, then we build the object
        Constructor<?> cons = doorClass.getDeclaredConstructor();
        Object myDoor = cons.newInstance();

        // 3. Define the parameter type (it takes one 'int')
        Class<?>[] params = new Class[] { int.class };

        // 4. Get the method named "unlock" with those parameters
        Method myMethod = doorClass.getDeclaredMethod("unlock", params);

        // 5. Run the method on 'myDoor' with the passcode 1234
        myMethod.invoke(myDoor, 1234);
    }
}