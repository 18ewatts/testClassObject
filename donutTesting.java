
/**
 * Write a description of class donutTesting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class donutTesting
{
    public static void main(String [] args)
    {
        donut chocolate = new donut();
        System.out.println(chocolate.getFlavour());
        donut glazed = new donut();
        glazed.setFlavour("yummy");
        System.out.println(glazed.getFlavour());
    }
}
