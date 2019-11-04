import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> productsTable = new HashMap<>();
        fillProductsTable(productsTable);
        PriceCalculator priceCalculator = new PriceCalculator(productsTable);
        int price = priceCalculator.getPrice("Prod.2", "Jan");
    }

    // fillProductsTable() {}


    private static Map<String, Map<String, Integer>> fillProductsTable(Map<String, Map<String, Integer>> x) {

        Map<String, Map<String, Integer>> productsTable = new HashMap<>();

        Map<String, Integer> jan = new HashMap<>();

        jan.put("Prod.1", 1);
        jan.put("Prod.2", 13);
        jan.put("Prod.3", 25);

        productsTable.put("Jan", jan);

        return productsTable;
    }
}
