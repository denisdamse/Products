public class UnCompensatedProduct extends Product {

    public static Product constructUnCompensatedProduct(String code,String name,int basePrice, int quantity, double coefficient,double finalPrice)
        {
            if(quantity>0)
            {
                return new UnCompensatedProduct(code,name,basePrice,quantity);
            }
            else
            {
                throw new IllegalArgumentException("Alert: quantity 0");
            }
        }
    private UnCompensatedProduct(String code,String name,int basePrice, int quantity)
    {
        super(code, name, basePrice, quantity);
        this.finalPrice=basePrice;
    }
    private double finalPrice;
    public double getFinalPrice()
    {
        return this.finalPrice;
    }
}
