    public class CompensatedProduct extends Product
    {
        public CompensatedProduct(String code,String name,int basePrice, int quantity,int coefficient)
        {
            super(code, name, basePrice, quantity);
            this.coefficient=basePrice*coefficient;
        }

        private int coefficient;

        public int getCoefficient()
        {
            return this.coefficient;
        }
    }