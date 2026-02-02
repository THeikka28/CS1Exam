import java.sql.SQLOutput;

public class Greenhouse {
    public String name;
    public boolean sprinklersOn;
    public int numberOfFlowers;
    public static void main(String[] args) {
       Greenhouse greenhouse = new Greenhouse();
    }
    public Greenhouse()
    {
        System.out.println("Hello World! Good luck on your exams!");
        System.out.println();//this is just to make space between different steps in the output
        name = "Planting Parameters at the CSG";
        sprinklersOn = true;
        numberOfFlowers = 31;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers!");
        System.out.println();//this is just to make space between different steps in the output
        numberOfFlowers = 6741;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers!");
        System.out.println();//this is just to make space between different steps in the output
        randomReplant();
        System.out.println();//this is just to make space between different steps in the output
        veggieOfTheDay("Corn");
        System.out.println();//this is just to make space between different steps in the output
        countFlowers();
        System.out.println();//this is just to make space between different steps in the output
        changeTemperature();
        System.out.println();//this is just to make space between different steps in the output
        Plant kimPlant = new Plant(3,"orange", true);
        kimPlant.printinfo();
        System.out.println();//this is just to make space between different steps in the output
        Plant myPlant = new Plant(1,"green", true);
        myPlant.printinfo();
        System.out.println();//this is just to make space between different steps in the output
        starTriangle(4);
        System.out.println();//this is just to make space between different steps in the output
        perimeterTriangle(20);
    }

    public void randomReplant()
    {
        int randomint = (int)(Math.random()*16);
        System.out.println("We are replanting " + randomint + " vegetables today!");
    }
    public void veggieOfTheDay(String veggie)
    {
        System.out.println("Today's chosen veggie is " + veggie + ".");
    }
    public void countFlowers()
    {
        for(int x = 2; x<7; x++){
            System.out.println(x);
        }
        for(int x = 20; x<111; x=x+30){
            System.out.println(x);
        }
        for(int x = 8; x>-1; x--){
            System.out.print(x + ", ");
        }
        System.out.println();
    }
    public void changeTemperature()
    {
        double randomnum = Math.random();
        if (randomnum <0.25)
        {
            System.out.println("The temperature has decreased by 2 degrees");
        }
        if(randomnum >=0.25 && randomnum<0.5)
        {
            System.out.println("The temperature has decreased by 1 degree");
        }
        if(randomnum >=0.5 && randomnum<0.75)
        {
            System.out.println("The temperature has increased by 1 degree");
        }
        if(randomnum >=0.75)
        {
            System.out.println("The temperature has increased by 2 degrees");
        }
    }
    public void starTriangle(int size)
    {
        for(int x = 1; x<size+1;x=x+1)
        {
            for(int y = 1; y<x+1; y++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void perimeterTriangle(int size)
    {
        for(int x = 1; x<size+1;x=x+1) {
            if (x == size) {
                for (int y = 1; y < x + 1; y++) {
                    System.out.print("- ");
                }
            } else {
                for (int y = 1; y < x + 1; y++) {
                    if (y == 1) {
                        System.out.print("- ");
                    } else if (y == x) {
                        System.out.print("- ");
                    } else {
                        System.out.print("* ");
                    }

                }

                System.out.println();
            }
        }
    }

}
