import java.awt.Color;

public class HouseClass
{
    private int numBedrooms;
    private Color color;
    private int numBathrooms;
    private String streetName;

    public HouseClass()
    {
        numBathrooms = 3;
        numBedrooms = 4;
        color = Color.BLUE;
        streetName = "Pecan";
    }

    public String tostring()
    {
        return "This is my house";
    }
}