
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    private String productName;
    private int productQuantity;

    /**
     * Constructor for objects of class Product
     */
    public Product()
    {
        
    }

    public void setProduct(String name, int quantity)
    {
        productName=name;
        productQuantity=quantity;
    }
    public String getName()
    {
        return productName;
    }
    public int getQuantity()
    {
        return productQuantity;
    }
   
}
