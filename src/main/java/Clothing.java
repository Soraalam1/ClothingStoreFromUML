public class Clothing {
    private String description;
    private double price;
    private char size;

    public Clothing(String description, double price, char size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }



    public boolean isAFit(Customer name){
        char size = name.getSize();
        if(size == this.size){
            return true;
        }
        else return false;
    }

    public String itemInfo(){
       return ("Item: " + this.description + ", price $" + this.price + ", size: " + this.size);
    }

    @Override
    public String toString() {
        return ("Clothing:" +
                "description :'" + this.description + '\'' +
                ", price =" + this.price +
                ", size =" + this.size +
                '.');
    }
}
