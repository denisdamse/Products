public class UnCompensatedProduct extends Product 
{
    public UnCompensatedProduct(String code,String name,int basePrice, int quantity)
    {
        super(code, name, basePrice, quantity);
    }

    public String toString()
    {
    return getCode()+" "+getName()+" "+getBasePrice()+" "+getQuantity();
    }
}
