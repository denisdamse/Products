    public class CompensatedProduct extends Product
    {
        public CompensatedProduct(String code,String name,int basePrice, int quantity,int coefficient, int finalPrice)
        {
            super(code, name, basePrice, quantity);
            this.finalPrice=basePrice*coefficient;
        }

        private int finalPrice;
        private int coefficient;

        public int getCoefficient()
        {
            return this.coefficient;
        }
        
        public int getFinalPrice()
        {
            return this.finalPrice;
        }

        public String toString()
        {
            return getCode()+" "+getName()+" "+this.getFinalPrice()+" "+getQuantity();
        }
    }