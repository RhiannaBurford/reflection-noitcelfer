public class Num3 {

    public static void main(String[] args){

        try{
            Class<?> class1 = Class.forName("Warrior");
            System.out.println("Class name: " + class1.getName());
            System.out.println("Superclass name: " + class1.getSuperclass().getName());
            Class<?> [] interfaces = class1.getInterfaces();
            for (int i =0; i < interfaces.length; i++){
                System.out.println("Interface: " + interfaces[i].getName());
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }
    }
}
