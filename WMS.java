import java.util.*;
/**
 * Write a description of class WMS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WMS
{
     private ArrayList<Product> productList;
     private ArrayList<Zone> zoneList;
    public WMS()
    {
       productList=new ArrayList<>();
       zoneList=new ArrayList<>();
       
    }

    public void warehouseBuilder()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("How many zones will your warehouse contain");
        int zoneNum=sc.nextInt();
        
        for(int i=0;i<zoneNum;i++)
        {
            Zone newZone=new Zone();
            newZone.zoneBuilder();
            zoneList.add(newZone);
        }
    }
    public void load()
    {
        Scanner scan=new Scanner(System.in);
  
        System.out.println("Enter the name of the location: ");
        String name=scan.nextLine();
        System.out.println("Enter the product: ");
        String product=scan.nextLine();
        Location loadLocation;
        
     
            
            
    }
    public void getZoneDetails()
    {
        for(Zone zone: zoneList)
        {
            zone.getZoneDetails();
        }
    }
}
