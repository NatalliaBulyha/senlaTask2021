package task5;

public class Item {
    private final int weight;
    private final int cost;

    public Item(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "{weight: " + weight + ", cost: " + cost + "}";
    }
}
