public class Product 
{
    public Product(String code,String name,int basePrice, int quantity)
    {
        if(Warehouse.productList.isEmpty())
        {
            this.code=code;
            this.name=name;
            this.basePrice=basePrice;
            this.quantity=quantity;
            Warehouse.productList.add(this);
        
        }
        else
        {
            for(Product o : Warehouse.productList)
            if(o.code.equals(code))
            {
                o.quantity=o.quantity+quantity;
            }
            else
            {
                System.out.println("hello");
                this.code=code;
                this.name=name;
                this.basePrice=basePrice;
                this.quantity=quantity;
                Warehouse.productList.add(this);
            }
        }
    }

    private String code;
    private String name;
    private int basePrice;
    private int quantity;

    public String getCode()
    {
        return this.code;
    }

    public String getName()
    {
        return this.name;
    }

    public int getBasePrice()
    {
        return this.basePrice;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public void setQuantity(int newQuantity)
    {
        this.quantity=newQuantity;
    }

    public String toString()
    {
        return this.code+" "+this.name+" "+this.basePrice+" "+this.quantity;
    }
}