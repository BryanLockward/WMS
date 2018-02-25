import java.util.*;
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    private String locationName;
    private boolean pickability;
    private Box box;
    
    public Location()
    {
        box=null;
    }
    public void setName(String name)
    {
        locationName=name;
    }
    public void setPickability(boolean pick)
    {
        pickability=pick;
    }
    public void getDetails()
    {
        System.out.println("Location: "+locationName);
        if(pickability=true)
        {
            System.out.println(locationName + " is pickable");
        }
        else{
            System.out.println(locationName + " is not pickable");
        }
        if(box==null)
        {
            System.out.println(locationName + "is empty");
        }
        else
        {
            System.out.println(locationName + " contains "+ box.boxQuantity() + 
            "pieces of " +box.getProduct());
        }
        System.out.println();
    }
    public void load(Box newBox)
    {
        box=newBox;
    }
    public String getLocationName()
    {
        return locationName;
    }
}
