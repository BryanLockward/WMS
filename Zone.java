import java.util.*;
/**
 * Write a description of class Zone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zone
{
    
    private ArrayList<Location> zone;
    private boolean pickability;
    private String zoneName;
    

    /**
     * Constructor for objects of class Zone
     */
    public Zone()
    {
        zone=new ArrayList<>();
    }
    public ArrayList getZone()
    {
        return zone;
    }
    public void zoneBuilder()
    {
        Scanner sc=new Scanner(System.in);
        Scanner scan=new Scanner(System.in);
        int row;
        int rack;
        int shelf;
        int spot;
        
        System.out.println("Enter the name of the zone: ");
        zoneName=sc.nextLine();
        
        System.out.println("Will this zone be pickable (y/s): ");
        if (sc.nextLine()=="y")
        {
            pickability=true;
        }
        else{
            pickability=false;
        }
        
        System.out.println("How many rows will this zone contain: ");
        row=scan.nextInt();
        
        System.out.println("How many racks will each row contain: ");
        rack=scan.nextInt();
        
        System.out.println("How many shelves will each rack contain: ");
        shelf=scan.nextInt();
        
        System.out.println("How many spots will each shelf contain: ");
        spot=scan.nextInt();
        
        char rowChar='A';
        char shelfChar='A';
        
        for(int i=1;i<=row;i++)
        {
            shelfChar='A';
            for(int j=1;j<=rack;j++)
            {
                
                for(int k=1;k<=shelf;k++)
                {
                    for(int l=1;l<=spot;l++)
                    {
                        String nameHolder= Character.toString(rowChar) + Integer.toString(j)+Character
                        .toString(shelfChar) + Integer.toString(l);
                        Location location=new Location();
                        location.setName(nameHolder);
                        location.setPickability(pickability);
                        zone.add(location);
                    }
                    shelfChar++;
                }
                shelfChar='A';
            }
            rowChar++;
        }
    }
    public void getZoneDetails()
    {
        zone.stream()
            .forEach(location->location.getDetails());
    }
    
}
