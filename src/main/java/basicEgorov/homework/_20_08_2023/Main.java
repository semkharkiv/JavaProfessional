package basicEgorov.homework._20_08_2023;

public class Main {
    public static void main(String[] args) {
        Store store = StoreJsonParser
                    .createStoreFromJSONFIle("src/main/java/basicEgorov/homework/_20_08_2023/report.json");

//        System.out.println(store.getId());
//        System.out.println(store.getMoreExpensiveSnack());
//        System.out.println(store.getMostInStockItemOfMoney());
//        System.out.println(store.getLessDrinkProductInStockOfMoney());
//        System.out.println(store.getCountOfIsAdvFood());
//        System.out.println(store.getGroupingIsPackedItems());
//        System.out.println(store.getMostDrinksItemMargin());
//        System.out.println(store.getThreeLessMarginAndActionProducts());
//        System.out.println(store.getSortedListInId());
        System.out.println(store.findCheapestLowStockProduct());
    }
}
