public class Employee extends Customer {
    private final double discount = 10;

    public Employee(String name, Clothing[] clothingItems) {
        super(name, clothingItems);
    }

    public double getDiscount() {
        return discount;
    }

    /*@Override
    public String toString() {
        return "Employee{" +
                "discount=" + discount +
                '}';*/
    //}
}
