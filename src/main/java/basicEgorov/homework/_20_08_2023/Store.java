package basicEgorov.homework._20_08_2023;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Store {
    private final Set<Product> products;

    public Store(Set<Product> products) {
        this.products = products;
    }

    //найти id продукта
    public List<Long> getId() {
        return products.stream()
                .map(Product::getId)
                .sorted()
                .collect(Collectors.toList());
    }

    //самый дорогой СНЭК
    public Product getMoreExpensiveSnack() {
        return products.stream()
                .filter(product -> product.getCategory().equals("SNACKS"))
                .max(Comparator.comparing(Product::getPrice))
                .orElse(null);
    }

    //какого товара больше всего на складе в деньгах
    public Product getMostInStockItemOfMoney() {
        return products.stream().max(Comparator.comparing(product ->
                        BigDecimal.valueOf(product.getQuantity()).multiply(product.getPrice())
                ))
                .orElse(null);
    }

    //какого ДРИНКС товара меньше всего на складе в деньгах
    public Product getLessDrinkProductInStockOfMoney() {
        return products.stream()
                .filter(product -> product.getCategory().equals("DRINKS"))
                .min(Comparator.comparing(product ->
                        BigDecimal.valueOf(product.getQuantity()).multiply(product.getPrice())))
                .orElse(null);
    }

    //количество видов акционного товара у ФУД
    public long getCountOfIsAdvFood() {
        return products.stream()
                .filter(product -> product.getCategory().equals("FOOD") && product.isAdv())
                .count();
    }

    //сгруппировать по упакованным и нет
    public Map<Boolean, List<Product>> getGroupingIsPackedItems() {
        return products.stream()
                .collect(Collectors.groupingBy(Product::isPacked));
    }

    //у какого ДРИНКС самая высокая маржа
    public Product getMostDrinksItemMargin() {
        return products.stream()
                .filter(product -> product.getCategory().equals("DRINKS"))
                .max(Comparator.comparing(product ->
                        product.getMargin().multiply(product.getPrice())
                ))
                .orElse(null);
    }

    //средняя маржа по категории
    public double getAvgMarginOfCategory(String category) {
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(product -> product.getMargin().doubleValue())))
                .get(category);
    }

    //первые три товара ФУД которые участвуют в акции и у которых самая низкая маржа
    public List<Product> getThreeLessMarginAndActionProducts() {
        return products.stream()
                .filter(product -> product.getCategory().equals("FOOD") && product.isAdv())
                .sorted(Comparator.comparing(Product::getMargin))
                .limit(3)
                .collect(Collectors.toList());
    }

    //поместить в три мапу отсортировав в ай ди. #37 - это ай ди.
    public TreeMap<Long, List<Product>> getSortedListInId() {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getId, TreeMap::new, Collectors.toList()));
    }

    //самый дешевый товар, которого меньше всего на складе осталось в кг или штуках в зависимости от ISPACKED
    public Product findCheapestLowStockProduct() {
        return products.stream()
                .min(Comparator.comparing(Product::getQuantity).thenComparing(Product::getPrice))
                .orElse(null);
    }
}
