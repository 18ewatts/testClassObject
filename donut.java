
/**
 * Write a description of class donut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class donut
{

private String flavour;
private int weight;
private String color;
private String ingredients;

    /**
     * Constructor for objects of class donut
     */
    public donut()
    {
        // initialise instance variables
        flavour = "sugary";
        weight = 34;
        color = "brown";
        ingredients = "dough";
    }
public String getFlavour()
{
    return this.flavour;
}
public void setFlavour(String newFlavour)
{
    this.flavour = newFlavour;
}
   
}
