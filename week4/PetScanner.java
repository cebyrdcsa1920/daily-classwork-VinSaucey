public class PetScanner
{
    public static void main(String[] args)
    {
        PetClass myChicken = new PetClass();

        myChicken.eat(0.29);
        System.out.println(myChicken.getWeight());
    }
}