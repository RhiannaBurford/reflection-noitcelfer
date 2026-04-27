public class Num5 {
    public static void main(String[] args){

        try{
            Class<?> potionClass = Class.forName("HealthPotion");
        }
        catch (ClassNotFoundException e){
            System.out.println("ERROR - class not found!");
        }
    }
}
