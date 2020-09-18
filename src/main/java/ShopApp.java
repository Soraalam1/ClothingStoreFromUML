import java.util.Random;

public class ShopApp {

    public static double calcTotal(Clothing[] clothesList){
        double total = 0;
        for(int index = 0; index < clothesList.length; index++){
            total += clothesList[index].getPrice();
        }
        return total;
    }

    public static double calcTax(double subtotal){
        double total = subtotal;
        final double tax = 10;
        total += (subtotal * tax) / 100;
        return total;
    }

    public static char measure(Customer customerName){
        //I made the measuring random in real time so it will be different everytime
        Random random = new Random();
        char size = '?';
        int seed = random.nextInt(3);
        switch (seed){
            case 0: size = 'S';
            break;
            case 1: size = 'M';
            break;
            case 2: size = 'L';
            break;
        }
        customerName.setSize(size);
        return size;
    }
    public double employeePriceAfterDisc(double input){
        double discount = 10;
        double subtotal = input;
        return subtotal -= (subtotal * discount) / 100;
    }
}
