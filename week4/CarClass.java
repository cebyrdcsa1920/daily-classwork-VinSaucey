import java.awt.Color;

public class CarClass
{
    private String model;
    private Color color;
    private int numPassengers;
    private double amountOfGas;
    private final double mpg;

    public CarClass()
    {
        model = "Mustang";
        color = Color.YELLOW;
        numPassengers = 5;
        amountOfGas = 12.5;
        mpg= 21;
    }

    /**
     * Drives the car the givrn distance. Subtracts gas from the tank.
     *
     * @param distance The distance driven in miles
     */

    public void drive(double distance)
    {
        amountOfGas -= distance / mpg;
    }

    public double getAmountOfGas()
    {
        return amountOfGas;
    }
    public String toString()
    {
        return "This is my Mustang";
    }
}