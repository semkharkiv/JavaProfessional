package main.exampleJavaPro._24_04_23.restaurantAppExample;

public class Order {
    private String nameOfDish;
    private int numberOfDish;
    private double priseOfDish;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public int getNumberOfDish() {
        return numberOfDish;
    }

    public void setNumberOfDish(int numberOfDish) {
        this.numberOfDish = numberOfDish;
    }

    public double getPriseOfDish() {
        return priseOfDish;
    }

    public void setPriseOfDish(double priseOfDish) {
        this.priseOfDish = priseOfDish;
    }

    public Order(String nameOfDish, int numberOfDish, double priseOfDish, int id) {
        this.nameOfDish = nameOfDish;
        this.numberOfDish = numberOfDish;
        this.priseOfDish = priseOfDish;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nameOfDish='" + nameOfDish + '\'' +
                ", numberOfDish=" + numberOfDish +
                ", priseOfDish=" + priseOfDish +
                ", id=" + id +
                '}';
    }
}
