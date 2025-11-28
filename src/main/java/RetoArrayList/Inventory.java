package RetoArrayList;
import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        // Aquí tu código
        items.add(item);
    }

    public boolean removeItem(String itemName) {
        // Aquí tu código
        if(items.stream().noneMatch(item -> item.getName().equals(itemName))) {
            return false;
        }
        items.remove(itemName);
        return true;
    }

    public Item findItem(String itemName) {
        // Aquí tu código
        if(items.stream().anyMatch(item -> item.getName().equals(itemName))) {
            for (Item item : items) {
                if (item.getName().equals(itemName)) {
                    return item;
                }
            }
        }
        return null;
    }

    public double getTotalWeight() {
        // Aquí tu código
        double sum = 0;
        for (Item item : items) {
            sum = sum + item.getWeight();
        }
        
        return sum; // sustituye esto por el valor real
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
