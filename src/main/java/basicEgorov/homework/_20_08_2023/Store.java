package basicEgorov.homework._20_08_2023;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Store {
    private final Set<Product> products;

    public Store(Set<Product> products) {
        this.products = products;
    }

    //найти id продукта
    public List<Long> getId (){
        return products.stream()
                .map(Product::getId)
                .collect(Collectors.toList());
    }

    //самый дорогой СНЭК
    public Product getMoreExpensiveSnack() {
        return products.stream()
                .filter(product -> product.getCategory().equals("Snack"))
                .max(Comparator.comparing(Product::getPrice))
                .orElse(null);
//    public Map<String, BigDecimal> getMoreExpensiveSnack() {
//        return products.stream()
//                .filter(product -> product.getCategory().equals("Snack"))
//                .collect(Collectors.groupingBy(
//                        Product::getName,
//                        Collectors.mapping(Product::getPrice, Collectors.maxBy(BigDecimal::compareTo))
//                ))
//                .entrySet().stream()
//                .collect(Collectors.toMap(Map.Entry::getKey,
//                        entry -> entry.getValue().orElse(BigDecimal.ZERO)
//                ));

    }
}
