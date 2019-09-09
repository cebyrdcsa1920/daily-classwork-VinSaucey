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
        mpg= 21.0;
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

    /**
     * Gets the amount of gas in the tank
     *
     * @return amount of gas
     */

    public double getAmountOfGas()
    {
        return amountOfGas;
    }
    public String toString()
    {
        return "This is my Mustang";
    }
}