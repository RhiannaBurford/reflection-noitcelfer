import java.lang.reflect.*;

public class Num14 {
    public static void main(String[] args) {
        try {
            // 1. Get Class and Instance
            Class<?> clazz = Class.forName("Account");
            Object myAcc = clazz.getDeclaredConstructor().newInstance();

            // 2. Prepare the Method "deposit" which takes a 'double'
            // Fill in the parameter type array
            Class<?>[] params = new Class[] { double.class };
            Method m = clazz.getDeclaredMethod("deposit", params);

            // 3. Invoke the method to deposit 500.0
            m.invoke(myAcc, 500.0);

            // 4. Get the PRIVATE field "balance"
            Field f = clazz.getDeclaredField("balance");
            f.setAccessible(true); // Turn on the skeleton key

            // 5. READ the value of the balance from myAcc
            // Hint: Instead of f.set(), use the method to retrieve a value
            Object currentBalance = f.get(myAcc);

            System.out.println("Current Balance is: " + currentBalance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}