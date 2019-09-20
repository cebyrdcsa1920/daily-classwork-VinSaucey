public class PetScanner
{
    public static void main(String[] args)
    {
        PetClass myChicken = new PetClass();

        myChicken.eat(1.5);
        System.out.println(myChicken.getWeight());
    }
}