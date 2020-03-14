public class Item {
    String name;
    Integer price;
    Double quantity;
    Integer sum;

    @Override
    public String toString() {
        return "\n\t\t" + "Item{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                ", sum='" + sum + '\'' +
                '}';
    }
}
