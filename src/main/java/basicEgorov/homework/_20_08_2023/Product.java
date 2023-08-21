package basicEgorov.homework._20_08_2023;

import java.math.BigDecimal;


//CATEGORY - это группа продуктов. Например:сладкое, вода, мясо итд.
//NAME - название продукта. Например "Шоколад Аленка", "Батон нарезной" или "Фарш говяжий" итд.
//FACTORY - Производитель товара, например "MARS", "Dirol Cadberry" итд.
//QUANTITY - количество товара на складе, если товар весовой то в килограммах, если в упаковке то в штуках.
//ISPACKED - если товар продается в упаковке то значение true, если нет то false.
//ISADV - участвует ли в какой-либо акционной программе. Если да ,то true если нет то false.
//PRICE - цена за единицу если ISPACKED - true, за килограмм если ISPACKED - false.
//MARGIN - процент прибыли с единицы товара если в упаковке и с килограмма если продается на вес.
//      Диапазон от 1,5% до 24% включительно. % может быть округлен до сотых.
//ISDEBT - должна ли магазину какая-либо FACTORY.
public class Product {
    private Long id;
    private String category;
    private String name;
    private String factory;
    private double quantity;
    private boolean isPacked;
    private boolean isAdv;
    private BigDecimal price;
    private BigDecimal margin;
    private boolean isDebt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public boolean isPacked() {
        return isPacked;
    }

    public void setPacked(boolean packed) {
        isPacked = packed;
    }

    public boolean isAdv() {
        return isAdv;
    }

    public void setAdv(boolean adv) {
        isAdv = adv;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMargin() {
        return margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    public boolean isDebt() {
        return isDebt;
    }

    public void setDebt(boolean debt) {
        isDebt = debt;
    }
}
