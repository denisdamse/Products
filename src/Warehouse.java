import java.util.ArrayList;

public class Warehouse 
{
   private static int numberOfProducts;

   public static ArrayList<Product> productList = new ArrayList<Product>();
   
   public int getNumberOfProducts()
   {
        return numberOfProducts;
   }

   public void setNumberOfProducts(int updatedValue)
   {
        numberOfProducts=updatedValue;
   }   
}
