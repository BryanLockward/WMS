
/**
 * Write a description of class Box here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Box
{
    private String boxType;
    private Product boxProduct;
    private String boxNumber;

    /**
     * Constructor for objects of class Box
     */
    public Box(Product product, String type,String num)
    {
       boxNumber=num;
       boxProduct=product;
       boxType=type;
    }

    public String getProduct()
    {
        return boxProduct.getName();
    }
    public int boxQuantity()
    {
        // put your code here
        return boxProduct.getQuantity();
    }
}
