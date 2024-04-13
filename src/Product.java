public class Product 
{
    public Product(String code,String name,int basePrice, int quantity)
    {
        this.code=code;
        this.name=name;
        this.basePrice=basePrice;
        this.quantity=quantity;
    }

    private String code;
    private String name;
    private int basePrice;
    private int quantity;

    public String getCode()
    {
        return this.code;
    }

    public String name()
    {
        return this.name;
    }

    public int basePrice()
    {
        return this.basePrice;
    }

    public int getQuantity()
    {
        return this.quantity;
    }
}
