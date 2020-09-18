import java.util.Arrays;

public class Customer {
    private String name;
    private Clothing[] clothingItems;
    private char size;

    public Customer(String name, Clothing[] clothingItems) {
        this.name = name;
        this.clothingItems = clothingItems;
    }

    public Clothing[] getClothingItems() {
        return clothingItems;
    }

    public char getSize() {

        return size;
    }

    public void setSize(char size){
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", clothingItems=" + Arrays.toString(clothingItems) +
                ", size=" + size +
                '}';
    }
}
