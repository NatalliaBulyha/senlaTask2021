package task5;

import java.util.List;

public class Backpack {
    private List<Item> items;
    private int weight;

    public Backpack(List<Item> items) {
        this.items = items;
        initWeight(items);
    }

    public Backpack() {
    }

    private void initWeight(List<Item> items) {
        int weight = 0;

        for (Item item : items) {
            weight += item.getWeight();
        }
        this.weight = weight;
    }


    public void printResultAfterOptimizeBag() {
        if (items != null && !items.isEmpty()) {
            System.out.println("Bag after optimize");
            System.out.println("Weight of the backpack : " + this.weight);
            System.out.println("Items :");

            for (Item item : items) {
                System.out.println("- " + item.toString());
            }
        } else {
            System.out.println("Sorry, no item was placed in the backpack");
        }
    }
}
