public class App {
    public static void main(String[] args) {
        Product produs1 = new Product("009", "Rosii", 9, 90);
        Product produs2 = new Product("009", "Rosii", 8, 9);
        Product produs3 = new Product("010", "Cartofi", 7, 80);
        System.out.println(Warehouse.productList);
    }
}
