import java.util.Map;

public class PriceCalculator {

    private Map<String, Map<String, Integer>> productsTable;

    public PriceCalculator(Map<String, Map<String, Integer>> productsTable) {
        this.productsTable = productsTable;
    }

    public Integer getPrice(String product, String month){

        int price = -1;

        if (productsTable != null && productsTable.containsKey(month)) {
            Map<String, Integer> productsFromTable = productsTable.get(month);
            if (productsFromTable.containsKey(product)) price = productsFromTable.get(product);
        }

        return price;
    }
}
