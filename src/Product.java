public class Product 
{
    public static Product constructProduct(String code,String name,int basePrice, int quantity)
    {
        if(quantity>0)
        {
            return new Product(code,name,basePrice,quantity);
        }
        else
        {
            throw new IllegalArgumentException("Alert: quantity 0");
        }
    }
    protected Product(String code,String name,double basePrice, int quantity)
    {
        this.code=code;
        this.name=name;
        this.basePrice=basePrice;
        this.quantity=quantity;
        Warehouse.numberOfProducts++;
    }
    
    private String code;
    private String name;
    private double basePrice;
    private int quantity;
    public void displayProduct()
    {
        System.out.println("Product code: "+code+", name: "+name+", price: "+basePrice+", cantitatea: "+quantity);
    }
    public String getCode()
    {
        return this.code;
    }
    public String getName()
    {
        return this.name;
    }
    public double getBasePrice()
    {
        return this.basePrice;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
}
