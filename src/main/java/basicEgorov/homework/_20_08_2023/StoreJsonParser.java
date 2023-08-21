package basicEgorov.homework._20_08_2023;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StoreJsonParser {
    public static Store createStoreFromJSONFIle(String path) {
        Set<Product> products = new HashSet<>();
        String json = readFromFile(path);
        JSONArray jsonArray = new JSONArray(json);

        for (int i = 0; i < json.length(); i++) {
            JSONObject object = jsonArray.getJSONObject(i);
            Product product = parseProductFromJSON(object);
            products.add(product);
        }
        return new Store(products);
    }

    private static Product parseProductFromJSON(JSONObject object) {
        Product product = new Product();
        String[] categoryAndId = object.getString("CATEGORY").split("#");
        String category = categoryAndId[0];
        Long id = Long.valueOf(categoryAndId[1]);

        product.setId(id);
        product.setCategory(category);
        product.setAdv(object.getBoolean("ISADV"));
        product.setName(object.getString("NAME").replace("#" + id, ""));
        product.setFactory(object.getString("FACTORY").replace("#" + id, ""));
        product.setDebt(object.getBoolean("ISDEBT"));
        product.setMargin(object.getBigDecimal("MARGIN"));
        product.setPacked(object.getBoolean("ISPACKED"));
        product.setQuantity(object.getDouble("QUANTITY"));
        product.setPrice(object.getBigDecimal("PRICE"));
        return product;
    }

    private static String readFromFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new IllegalArgumentException("");
        }
    }
}
