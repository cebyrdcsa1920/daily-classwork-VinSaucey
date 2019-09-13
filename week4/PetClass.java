import java.awt.Color;

public class PetClass
{
    private String species;
    private Color color;
    private int age;
    private int legs;
    private double weight;
    private String name;

    public PetClass()
    {
        species = "chicken";
        color = Color.WHITE;
        age = 3;
        legs = 2;
        weight = 4.07;
        name = "Izzy";
    }

    public PetClass(String species, Color color, int age, int legs, double weight, String name)
    {
        this.species = species;
        this.color = color;
        this.age = age;
        this.legs = legs;
        this. weight = weight;
        this.name = name;
    }

    public void eat(double foodInPounds)
    {
        weight += foodInPounds;
    }

    public double getWeight()
    {
        return weight;
    }
}