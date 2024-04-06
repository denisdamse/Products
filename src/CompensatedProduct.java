    public class CompensatedProduct extends Product
    {
        public static Product constructCompensatedProduct(String code,String name,int basePrice, int quantity, double coefficient,double finalPrice)
        {
            if(quantity>0)
            {
                return new CompensatedProduct(code,name,basePrice,quantity,coefficient);
            }
            else
            {
                throw new IllegalArgumentException("Alert: quantity 0");
            }
        }
        private CompensatedProduct(String code,String name,int basePrice, int quantity, double coefficient)
        {
            super(code, name, basePrice, quantity);
            this.coefficient=coefficient;
            this.finalPrice=basePrice*coefficient;
        }
        private double coefficient;  
        private double finalPrice;
        public double getCoefficient()
        {
            return this.coefficient;
        }
        public double getFinalPrice()
        {
            return this.finalPrice;
        }
        
    }