import java.sql.SQLOutput;

public class Plant {
    public int numWeeksOld;
    public String color;
    public boolean isEdible;
    public Plant(int pweeksOld, String pcolor, boolean pEdible)
    {
        numWeeksOld = pweeksOld;
        color = pcolor;
        isEdible = pEdible;
    }
    public void printinfo()
    {
        System.out.println("The plant is " + numWeeksOld + " weeks old. It is " + isEdible + " that the plant is edible, and the plant is " + color + ".");
    }
}
