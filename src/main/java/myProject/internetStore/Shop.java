package myProject.internetStore;

public class Shop
{
    Inventory inventory = new Inventory();

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "inventory=" + inventory +
                '}';
    }
}
